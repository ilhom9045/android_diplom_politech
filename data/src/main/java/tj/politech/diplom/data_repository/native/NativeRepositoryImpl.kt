package tj.politech.diplom.data_repository.native

class NativeRepositoryImpl : NativeRepository {

    init {
        System.loadLibrary("data")
    }

    external override fun getBaseUrl(): String
}