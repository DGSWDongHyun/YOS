package kr.hs.dgsw.donghyeon.domain.entity

import com.google.gson.annotations.SerializedName

data class GameData(
    @SerializedName("quickplay")
    val quickPlayData : QuickPlayData?,
    @SerializedName("competitive")
    val competitiveData : CompetitiveData
)

data class CompetitiveData(
    @SerializedName("won")
    val wonData: Int?,
    @SerializedName("lost")
    val lostData : Int?,
    @SerializedName("draw")
    val drawData : Int?,
    @SerializedName("played")
    val playedData : Int?,
    @SerializedName("win_rate")
    val winRateData : String?
)

data class QuickPlayData(
    @SerializedName("won")
    val wonData : Int?
)