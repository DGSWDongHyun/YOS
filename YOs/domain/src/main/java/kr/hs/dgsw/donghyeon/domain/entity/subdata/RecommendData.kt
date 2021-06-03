package kr.hs.dgsw.donghyeon.domain.entity

import com.google.gson.annotations.SerializedName

data class RecommendData(
    @SerializedName("sportsmanship")
    val sportsManShipData : RecommendedData,
    @SerializedName("shotcaller")
    val shotCallerData : RecommendedData,
    @SerializedName("teammate")
    val teamMateData : RecommendedData,
    @SerializedName("level")
    val level : Int?,
    @SerializedName("frame")
    val frameData : String?,
    @SerializedName("icon")
    val iconData : String?
)

data class RecommendedData(
    @SerializedName("value")
    val value : Double?,
    @SerializedName("rate")
    val rate : Int?
)