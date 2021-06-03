package kr.hs.dgsw.donghyeon.data.network.remote

import io.reactivex.Single
import kr.hs.dgsw.donghyeon.data.base.BaseRemote
import kr.hs.dgsw.donghyeon.data.network.service.SearchService
import kr.hs.dgsw.donghyeon.domain.entity.ResponseSearchedEntity

class SearchedRemote(override val service: SearchService) : BaseRemote<SearchService>() {
    fun getSearchRemote(type : String?, battleTag : String?) : Single<ResponseSearchedEntity> {
        return service.getSearchedData(type!!, battleTag).map { it.body()!! }
    }
}