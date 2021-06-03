package kr.hs.dgsw.donghyeon.data.network.service

import io.reactivex.Single
import kr.hs.dgsw.donghyeon.domain.entity.ResponseSearchedEntity
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface SearchService {
    @GET("player/{type}/global/{nameWithBattleTag}")
    fun getSearchedData(@Path("type") type : String = "pc",
                      @Path("nameWithBattleTag") battleTag : String?) : Single<Response<ResponseSearchedEntity>>
}