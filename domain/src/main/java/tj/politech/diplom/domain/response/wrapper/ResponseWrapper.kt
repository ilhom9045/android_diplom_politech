package tj.politech.diplom.domain.response.wrapper

import com.google.gson.annotations.SerializedName

data class ResponseWrapper<T>(
    @SerializedName("status")
    val status: String,
    @SerializedName("data")
    val data: T?,
    @SerializedName("message")
    val message: String
)