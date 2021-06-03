package kr.hs.dgsw.donghyeon.yos.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kr.hs.dgsw.donghyeon.yos.view.activities.MainActivity
import kr.hs.dgsw.donghyeon.yos.view.activities.WelcomeActivity
import kr.hs.dgsw.donghyeon.yos.di.scope.PerActivity

@Module
abstract class ActivityBindingModule {

    @PerActivity
    @ContributesAndroidInjector
    abstract fun bindingMainActivity() : MainActivity

    @PerActivity
    @ContributesAndroidInjector
    abstract fun bindingWelcomeActivity() : WelcomeActivity

}