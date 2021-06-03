package kr.hs.dgsw.donghyeon.yos.viewmodel.fragments

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.observers.DisposableSingleObserver
import kr.hs.dgsw.donghyeon.domain.entity.ResponseSearchedEntity
import kr.hs.dgsw.donghyeon.domain.usecase.SearchedUseCase
import kr.hs.dgsw.donghyeon.yos.base.viewmodel.BaseViewModel
import javax.inject.Inject

class SearchedViewModel @Inject constructor(
    private val application : Application,
    val searchedUseCase: SearchedUseCase
) : BaseViewModel() {

    val isLoading = MutableLiveData<Boolean>()
    val hasCompleted = MutableLiveData<Boolean>()

    val searchedNickName = MutableLiveData<String>()
    val searchedProfileUrl = MutableLiveData<String>()
    val searchedLevel = MutableLiveData<String>()

    init {
        isLoading.value = true
        hasCompleted.value = false
    }

    fun loadSearchedResponse(type : String?, battleTag : String?) {
        addDisposable(searchedUseCase.buildUseCaseObservable(type!!, battleTag!!),
            object : DisposableSingleObserver<ResponseSearchedEntity>() {
                override fun onSuccess(response : ResponseSearchedEntity) {
                    Log.d("TAG", "$response")
                    isLoading.value = false
                    hasCompleted.value = true

                    searchedNickName.value = response.userName
                    searchedProfileUrl.value = response.portraitUrl
                    searchedLevel.value = "레벨 : ${response.level}"
                }

                override fun onError(e: Throwable) {
                    Log.d("TAG", "${e.message}")
                }
            })
    }
}