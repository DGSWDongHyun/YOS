package kr.hs.dgsw.donghyeon.yos.widget.application

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kr.hs.dgsw.donghyeon.yos.di.injector.ApplicationInjector
import javax.inject.Inject

class YOSApplication : Application(), HasAndroidInjector {
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    override fun onCreate() {
        super.onCreate()
        ApplicationInjector().init(this)
    }
}