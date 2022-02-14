package tj.politech.diplom.core.fragment

import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModelProvider
import tj.politech.diplom.core.viewmodel.BaseViewModel
import tj.politech.diplom.core.viewmodel.SharedViewModel

abstract class BaseFragmentWithParentViewModel<S : SharedViewModel, V : BaseViewModel>(
    clazz: Class<V>,
    @LayoutRes layout: Int
) : BaseFragment(layout) {

    protected val parentViewModel: S by lazy {
        ViewModelProvider(requireActivity())[clazz] as S
    }
}