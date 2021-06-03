package kr.hs.dgsw.donghyeon.yos.viewmodel.adapters

import androidx.lifecycle.MutableLiveData
import kr.hs.dgsw.donghyeon.domain.entity.subdata.CompetitiveData
import kr.hs.dgsw.donghyeon.yos.base.viewmodel.BaseViewModel

class PositionViewModel : BaseViewModel() {

    val searchedPosition = MutableLiveData<CompetitiveData>()
    val searchedPositionText = MutableLiveData<String>()
    val searchedPositionRankUrl = MutableLiveData<String>()

    init {
        searchedPosition.value = CompetitiveData(0, "", "", "")
        searchedPositionText.value = ""
        searchedPositionRankUrl.value = ""
    }

    fun bind(data : CompetitiveData) {
        searchedPosition.value = data
        searchedPositionRankUrl.value = data.rankIcon
        searchedPositionText.value = "${data.scoreRole}점"
    }
}