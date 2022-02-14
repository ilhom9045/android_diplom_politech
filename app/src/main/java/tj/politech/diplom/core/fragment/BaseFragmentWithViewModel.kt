package tj.politech.diplom.core.fragment

import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModelProvider
import tj.politech.diplom.core.viewmodel.BaseViewModel
import tj.politech.diplom.core.viewmodel.SharedViewModel

abstract class BaseFragmentWithViewModel<V : BaseViewModel>(
    clazz: Class<V>,
    @LayoutRes layout: Int
) : BaseFragment(layout = layout) {

    protected val viewModel by lazy {
        ViewModelProvider(this)[clazz]
    }
}