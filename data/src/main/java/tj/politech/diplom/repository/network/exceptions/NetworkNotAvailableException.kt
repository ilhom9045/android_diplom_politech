package tj.politech.diplom.repository.network.exceptions

import java.lang.Exception

class NetworkNotAvailableException(override val message: String?) : Exception()