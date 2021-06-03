package kr.hs.dgsw.donghyeon.yos.viewmodelfactory.fragments

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kr.hs.dgsw.donghyeon.domain.usecase.SearchedUseCase
import javax.inject.Inject

class SearchedViewModelFactory @Inject constructor(
    private val application : Application,
    val searchedUseCase: SearchedUseCase
): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(
            Application::class.java,
            SearchedUseCase::class.java
        ).newInstance(application, searchedUseCase)
    }
}