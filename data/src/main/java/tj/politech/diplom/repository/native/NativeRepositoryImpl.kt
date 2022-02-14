package tj.politech.diplom.repository.native

import tj.politech.diplom.repository.network.NetworkRepository

class NativeRepositoryImpl : NativeRepository {

    init {
        System.loadLibrary("data")
    }

    external override fun getBaseUrl(): String
}