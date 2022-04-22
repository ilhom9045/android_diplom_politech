package tj.politech.diplom.data_repository.network

import tj.politech.diplom.data_repository.network.api.Api

interface NetworkRepository {
    fun <T : Api> createService(clazz: Class<T>): T
}