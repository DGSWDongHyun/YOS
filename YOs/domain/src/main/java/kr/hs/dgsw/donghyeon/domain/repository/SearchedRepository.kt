package kr.hs.dgsw.donghyeon.domain.repository


import io.reactivex.Single
import kr.hs.dgsw.donghyeon.domain.entity.ResponseSearchedEntity

interface SearchedRepository {
    fun getSearchedResponse(type : String?, battleTag : String?) : Single<ResponseSearchedEntity>
}