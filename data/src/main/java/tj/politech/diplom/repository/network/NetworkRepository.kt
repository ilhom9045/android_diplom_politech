package tj.politech.diplom.repository.network

import tj.politech.diplom.repository.network.api.BaseApi

interface NetworkRepository {
    fun <T : BaseApi> createService(clazz: Class<T>): T
}