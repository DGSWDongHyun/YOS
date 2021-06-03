package kr.hs.dgsw.donghyeon.yos.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import kr.hs.dgsw.donghyeon.yos.di.module.*
import kr.hs.dgsw.donghyeon.yos.widget.application.YOSApplication
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ActivityBindingModule::class,
        FragmentBindingModule::class,
        NetworkModule::class,
        RemoteModule::class,
        AppModule::class,
        RepositoryModule::class,
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class
    ]
)

interface AppComponent : AndroidInjector<YOSApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}