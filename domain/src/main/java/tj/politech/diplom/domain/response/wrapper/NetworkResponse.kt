package tj.politech.diplom.domain.response.wrapper

import java.lang.Exception

sealed class NetworkResponse<out T, out U> {
    data class Success<T>(val body: T) : NetworkResponse<T, Nothing>()
    data class ApiError<U>(val body: U?, val code: Int) : NetworkResponse<Nothing, U>()
    data class NetworkError(val error: Exception) : NetworkResponse<Nothing, Nothing>()
    data class UnknownError(val error: Throwable?) : NetworkResponse<Nothing, Nothing>()
}
