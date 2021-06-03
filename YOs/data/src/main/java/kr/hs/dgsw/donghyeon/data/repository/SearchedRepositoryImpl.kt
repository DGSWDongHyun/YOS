package kr.hs.dgsw.donghyeon.data.repository

import io.reactivex.Single
import kr.hs.dgsw.donghyeon.data.datasource.SearchedDataSource
import kr.hs.dgsw.donghyeon.domain.entity.ResponseSearchedEntity
import kr.hs.dgsw.donghyeon.domain.repository.SearchedRepository
import javax.inject.Inject

class SearchedRepositoryImpl @Inject constructor(
    private val searchedDataSource: SearchedDataSource
) : SearchedRepository {
    override fun getSearchedResponse(type: String?, battleTag: String?): Single<ResponseSearchedEntity>
            = searchedDataSource.getSearchResponse(type, battleTag)
}