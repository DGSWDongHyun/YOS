package kr.hs.dgsw.donghyeon.domain.base

abstract class ParamUseCase<in Params, in Params2, out T> {
    abstract fun buildUseCaseObservable(params: Params, params2: Params2): T
}