package tj.politech.diplom.core.fragment

import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModelProvider
import tj.politech.diplom.core.viewmodel.BaseViewModel
import tj.politech.diplom.core.viewmodel.SharedViewModel

abstract class BaseFragmentWithSharedViewModel<S : SharedViewModel, V : BaseViewModel>(
    clazz: Class<V>,
    @LayoutRes layout: Int
) : BaseFragment(layout) {

    protected val sharedViewModel: S by lazy {
        ViewModelProvider(requireActivity())[clazz] as S
    }
}