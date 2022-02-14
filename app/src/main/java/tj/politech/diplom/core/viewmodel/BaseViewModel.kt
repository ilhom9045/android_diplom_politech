package tj.politech.diplom.core.viewmodel

import androidx.lifecycle.ViewModel
import org.koin.core.component.KoinComponent

abstract class BaseViewModel : ViewModel(), KoinComponent, SharedViewModel {

}