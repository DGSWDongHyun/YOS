package kr.hs.dgsw.donghyeon.yos.view.activities

import kr.hs.dgsw.donghyeon.yos.R
import kr.hs.dgsw.donghyeon.yos.base.view.BaseActivity
import kr.hs.dgsw.donghyeon.yos.databinding.ActivityWelcomeBinding
import kr.hs.dgsw.donghyeon.yos.viewmodel.activities.WelcomeViewModel
import kr.hs.dgsw.donghyeon.yos.viewmodelfactory.activities.WelcomeViewModelFactory
import kr.hs.dgsw.donghyeon.yos.widget.extensions.activity.getViewModel
import javax.inject.Inject

class WelcomeActivity @Inject constructor(

) : BaseActivity<ActivityWelcomeBinding, WelcomeViewModel>() {

    @Inject
    lateinit var viewModelFactory: WelcomeViewModelFactory

    override val viewModel: WelcomeViewModel
        get() = getViewModel(viewModelFactory)
    override val layoutRes: Int
        get() = R.layout.activity_welcome

    override fun onCreatedView(view: ActivityWelcomeBinding) {
        // task of view
        view.startButton.setOnClickListener {
            finish()
        }
    }

    override fun onBackPressed() { // optional setting of WelcomeActivity.kt #1
        return
    }
}