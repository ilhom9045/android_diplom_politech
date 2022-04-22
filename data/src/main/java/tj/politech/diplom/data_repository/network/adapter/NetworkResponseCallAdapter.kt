package tj.politech.diplom.data_repository.network.adapter

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.CallAdapter
import retrofit2.Converter
import tj.politech.diplom.data_repository.network.adapter.call.NetworkResponseCall
import tj.politech.diplom.domain.response.wrapper.NetworkResponse
import java.lang.reflect.Type

class NetworkResponseCallAdapter<T, E>(
    private val successType: Type,
    private val errorBodyConverter: Converter<ResponseBody, E>,
) : CallAdapter<T, Call<NetworkResponse<T, E>>> {

    override fun responseType(): Type = successType

    override fun adapt(call: Call<T>): Call<NetworkResponse<T, E>> {
        return NetworkResponseCall(call, errorBodyConverter)
    }

}