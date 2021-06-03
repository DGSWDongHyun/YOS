package kr.hs.dgsw.donghyeon.yos.di.injector

import kr.hs.dgsw.donghyeon.yos.widget.application.YOSApplication
import kr.hs.dgsw.donghyeon.yos.di.component.DaggerAppComponent

class ApplicationInjector {
    fun init(application : YOSApplication) {
        DaggerAppComponent
            .builder()
            .application(application)
            .build()
            .inject(application)
    }
}