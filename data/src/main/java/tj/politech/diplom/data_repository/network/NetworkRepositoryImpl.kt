package tj.politech.diplom.data_repository.network

import android.content.Context
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import tj.politech.diplom.BuildConfig
import tj.politech.diplom.data_repository.native.NativeRepository
import tj.politech.diplom.data_repository.network.adapter.NetworkResponseCallFactory
import tj.politech.diplom.data_repository.network.api.Api
import tj.politech.diplom.data_repository.network.interceptor.NetworkAvailableInterceptor

class NetworkRepositoryImpl(
    private val context: Context,
    private val nativeRepository: NativeRepository
) : NetworkRepository {

    override fun <T : Api> createService(clazz: Class<T>): T {
        return Retrofit
            .Builder()
            .baseUrl(nativeRepository.getBaseUrl())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(NetworkResponseCallFactory())
            .client(okhttpClient())
            .build()
            .create(clazz)
    }

    private fun okhttpClient() =
        OkHttpClient.Builder().apply {
            if (BuildConfig.DEBUG) {
                addInterceptor(HttpLoggingInterceptor().apply {
                    level = HttpLoggingInterceptor.Level.BODY
                })
            }
            addInterceptor(NetworkAvailableInterceptor(context))
        }.build()
}