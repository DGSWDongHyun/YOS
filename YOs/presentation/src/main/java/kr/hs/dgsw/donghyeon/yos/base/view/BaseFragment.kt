package kr.hs.dgsw.donghyeon.yos.base.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import dagger.android.support.DaggerFragment
import kr.hs.dgsw.donghyeon.yos.BR
import kr.hs.dgsw.donghyeon.yos.base.viewmodel.BaseViewModel

abstract class BaseFragment <VB : ViewDataBinding, VM : BaseViewModel> : DaggerFragment() {

    private lateinit var viewDataBinding : VB
    abstract val viewModel : VM
    abstract val layoutRes : Int

    abstract fun observeViewModel(view : VB)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        performDataBinding(inflater, container)
        return viewDataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeViewModel(viewDataBinding)
    }

    private fun performDataBinding(inflater: LayoutInflater, container: ViewGroup?) {
        viewDataBinding = DataBindingUtil.inflate(inflater, layoutRes, container, false)

        viewDataBinding.run {
            lifecycleOwner = requireActivity()
            setVariable(BR.viewModel, viewModel)
            executePendingBindings()
        }
    }

}