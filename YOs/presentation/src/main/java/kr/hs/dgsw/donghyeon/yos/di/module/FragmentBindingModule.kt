package kr.hs.dgsw.donghyeon.yos.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import kr.hs.dgsw.donghyeon.yos.view.fragments.HomeFragment
import kr.hs.dgsw.donghyeon.yos.view.fragments.SearchedFragment
import kr.hs.dgsw.donghyeon.yos.di.scope.PerFragment

@Module
abstract class FragmentBindingModule {

    @PerFragment
    @ContributesAndroidInjector
    abstract fun bindingHomeFragment() : HomeFragment

    @PerFragment
    @ContributesAndroidInjector
    abstract fun bindingSearchedFragment() : SearchedFragment

}