package tj.politech.diplom.core.fragment

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment(@LayoutRes layout: Int) : Fragment(layout) {
    abstract override fun onViewCreated(view: View, savedInstanceState: Bundle?)
}