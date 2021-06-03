package kr.hs.dgsw.donghyeon.yos.view.activities

import android.content.Intent
import kr.hs.dgsw.donghyeon.yos.R
import kr.hs.dgsw.donghyeon.yos.base.view.BaseActivity
import kr.hs.dgsw.donghyeon.yos.databinding.ActivityMainBinding
import kr.hs.dgsw.donghyeon.yos.viewmodel.activities.MainViewModel
import kr.hs.dgsw.donghyeon.yos.viewmodelfactory.activities.MainViewModelFactory
import kr.hs.dgsw.donghyeon.yos.widget.extensions.activity.getViewModel
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    @Inject
    lateinit var viewModelFactory : MainViewModelFactory

    override val viewModel: MainViewModel
        get() = getViewModel(viewModelFactory)
    override val layoutRes: Int
        get() = R.layout.activity_main

    override fun onCreatedView(view: ActivityMainBinding) {
        //extensions of activity
        startActivity(Intent(applicationContext, WelcomeActivity::class.java))
        // task of view
    }
}