package kr.hs.dgsw.donghyeon.yos.di.module

import dagger.Module
import dagger.Provides
import kr.hs.dgsw.donghyeon.data.repository.SearchedRepositoryImpl
import kr.hs.dgsw.donghyeon.domain.repository.SearchedRepository
import javax.inject.Singleton

@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideSearchedRepository(searchedRepositoryImpl: SearchedRepositoryImpl): SearchedRepository {
        return searchedRepositoryImpl
    }
}