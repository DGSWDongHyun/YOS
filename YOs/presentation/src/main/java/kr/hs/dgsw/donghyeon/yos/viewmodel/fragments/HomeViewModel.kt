package kr.hs.dgsw.donghyeon.yos.viewmodel.fragments

import android.app.Application
import androidx.lifecycle.ViewModel
import kr.hs.dgsw.donghyeon.yos.base.viewmodel.BaseViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val application : Application
) : BaseViewModel() {

}