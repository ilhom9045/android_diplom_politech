package tj.politech.diplom.response.typeAlias

import tj.politech.diplom.response.wrapper.GenericError
import tj.politech.diplom.response.wrapper.NetworkResponse
import tj.politech.diplom.response.wrapper.ResponseWrapper

typealias GenericResponse<T> = NetworkResponse<ResponseWrapper<T>, GenericError>
typealias GenericResponseArrayList<T> = NetworkResponse<ResponseWrapper<ArrayList<T>>, GenericError>