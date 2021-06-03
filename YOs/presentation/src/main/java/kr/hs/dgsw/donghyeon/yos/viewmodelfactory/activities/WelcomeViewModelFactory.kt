package kr.hs.dgsw.donghyeon.yos.viewmodelfactory.activities

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class WelcomeViewModelFactory @Inject constructor(
    val application : Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(
            Application::class.java
        ).newInstance(application)
    }
}