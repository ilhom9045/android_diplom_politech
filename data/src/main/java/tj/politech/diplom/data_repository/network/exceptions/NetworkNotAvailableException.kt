package tj.politech.diplom.data_repository.network.exceptions

import java.lang.Exception

class NetworkNotAvailableException(override val message: String?) : Exception()