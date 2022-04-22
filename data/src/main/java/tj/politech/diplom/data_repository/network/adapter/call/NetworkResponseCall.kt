package tj.politech.diplom.data_repository.network.adapter.call

import kotlinx.coroutines.CoroutineScope
import okhttp3.ResponseBody
import okio.IOException
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Converter
import retrofit2.Response
import tj.politech.diplom.domain.response.wrapper.NetworkResponse

class NetworkResponseCall<T, E>(
    private val delegate: Call<T>,
    private val errorConverter: Converter<ResponseBody, E>
) : Call<NetworkResponse<T, E>> {

    override fun enqueue(callback: Callback<NetworkResponse<T, E>>) {

        delegate.enqueue(object : Callback<T> {
            override fun onResponse(call: Call<T>, response: Response<T>) {
                val body = response.body()
                val code = response.code()
                val error = response.errorBody()
                if (response.isSuccessful) {
                    when (code) {
                        500 -> {

                        }
                    }
                    if (body != null) {
                        callback.onResponse(
                            this@NetworkResponseCall,
                            Response.success(NetworkResponse.Success(body))
                        )
                    } else {
                        callback.onResponse(
                            this@NetworkResponseCall,
                            Response.success(NetworkResponse.UnknownError(null))
                        )
                    }
                } else {
                    val errorBody = when {
                        error == null -> null
                        error.contentLength() == 0L -> null
                        else -> {
                            try {
                                errorConverter.convert(error)
                            } catch (e: Exception) {
                                e.printStackTrace()
                                null
                            }
                        }
                    }
                    if (errorBody != null) {
                        callback.onResponse(
                            this@NetworkResponseCall,
                            Response.success(NetworkResponse.ApiError(errorBody, code))
                        )
                    } else {
                        callback.onResponse(
                            this@NetworkResponseCall,
                            Response.success(NetworkResponse.UnknownError(null))
                        )
                    }
                }
            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                val networkResponse = when (t) {
                    is IOException -> NetworkResponse.NetworkError(t)
                    else -> NetworkResponse.UnknownError(t)
                }
                callback.onResponse(
                    this@NetworkResponseCall,
                    Response.success(networkResponse)
                )
            }

        })
    }

    override fun execute(): Response<NetworkResponse<T, E>> {
        throw UnsupportedOperationException("NetworkResponseCall doesn`t support execute")
    }

    override fun clone() = NetworkResponseCall(delegate.clone(), errorConverter)

    override fun isExecuted() = delegate.isExecuted

    override fun cancel() = delegate.cancel()

    override fun isCanceled() = delegate.isCanceled

    override fun request() = delegate.request()

    override fun timeout() = delegate.timeout()

}