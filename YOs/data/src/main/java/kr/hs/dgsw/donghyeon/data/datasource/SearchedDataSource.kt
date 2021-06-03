package kr.hs.dgsw.donghyeon.data.datasource


import io.reactivex.Single
import kr.hs.dgsw.donghyeon.data.base.BaseDataSource
import kr.hs.dgsw.donghyeon.data.network.remote.SearchedRemote
import kr.hs.dgsw.donghyeon.domain.entity.ResponseSearchedEntity
import javax.inject.Inject

class SearchedDataSource @Inject constructor(
    override val remote: SearchedRemote,
    override val cache: Any
) : BaseDataSource<SearchedRemote, Any>(){

    fun getSearchResponse(type : String?, battleTag : String?) : Single<ResponseSearchedEntity> {
        return remote.getSearchRemote(type!!, battleTag)
    }

}