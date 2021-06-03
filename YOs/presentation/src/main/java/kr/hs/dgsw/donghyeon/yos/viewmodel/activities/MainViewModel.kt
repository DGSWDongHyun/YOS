package kr.hs.dgsw.donghyeon.yos.viewmodel.activities

import android.app.Application
import androidx.lifecycle.ViewModel
import kr.hs.dgsw.donghyeon.domain.usecase.SearchedUseCase
import kr.hs.dgsw.donghyeon.yos.base.viewmodel.BaseViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val application : Application
) : BaseViewModel() {
}