package kr.hs.dgsw.donghyeon.domain.usecase


import io.reactivex.Single
import kr.hs.dgsw.donghyeon.domain.base.ParamUseCase
import kr.hs.dgsw.donghyeon.domain.entity.ResponseSearchedEntity
import kr.hs.dgsw.donghyeon.domain.repository.SearchedRepository
import javax.inject.Inject

class SearchedUseCase @Inject constructor(
    val repository: SearchedRepository
) : ParamUseCase<String, String, Single<ResponseSearchedEntity>>() {

    override fun buildUseCaseObservable(params: String, params2: String): Single<ResponseSearchedEntity> = repository.getSearchedResponse(params, params2)
}