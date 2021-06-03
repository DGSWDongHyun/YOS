package kr.hs.dgsw.donghyeon.yos.base.view

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import com.jaeger.library.StatusBarUtil
import dagger.android.support.DaggerAppCompatActivity
import kr.hs.dgsw.donghyeon.yos.BR
import kr.hs.dgsw.donghyeon.yos.base.viewmodel.BaseViewModel

abstract class BaseActivity <VB : ViewDataBinding, VM : BaseViewModel> : DaggerAppCompatActivity() {

    private lateinit var viewDataBinding : VB

    abstract val viewModel : VM
    abstract val layoutRes : Int

    abstract fun onCreatedView(view : VB)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        StatusBarUtil.setTransparent(this) // transparent status bar

        performDataBinding()
        onCreatedView(viewDataBinding)
    }

    private fun performDataBinding() {
        viewDataBinding = DataBindingUtil.setContentView(this, layoutRes)

        viewDataBinding.run {
            lifecycleOwner = this@BaseActivity
            setVariable(BR.viewModel, viewModel)
            executePendingBindings()
        }
    }
}