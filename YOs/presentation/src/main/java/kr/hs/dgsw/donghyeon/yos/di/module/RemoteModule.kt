package kr.hs.dgsw.donghyeon.yos.di.module

import dagger.Module
import dagger.Provides
import kr.hs.dgsw.donghyeon.data.network.remote.SearchedRemote
import kr.hs.dgsw.donghyeon.data.network.service.SearchService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class RemoteModule {
    @Singleton
    @Provides
    fun provideLoginRemote(retrofit : Retrofit) : SearchedRemote {
        return SearchedRemote(retrofit.create(SearchService::class.java))
    }
}