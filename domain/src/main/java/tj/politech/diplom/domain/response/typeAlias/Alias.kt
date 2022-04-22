package tj.politech.diplom.domain.response.typeAlias

import tj.politech.diplom.domain.response.wrapper.GenericError
import tj.politech.diplom.domain.response.wrapper.NetworkResponse
import tj.politech.diplom.domain.response.wrapper.ResponseWrapper

typealias GenericResponse<T> = NetworkResponse<ResponseWrapper<T>, GenericError>
typealias GenericResponseArrayList<T> = NetworkResponse<ResponseWrapper<ArrayList<T>>, GenericError>