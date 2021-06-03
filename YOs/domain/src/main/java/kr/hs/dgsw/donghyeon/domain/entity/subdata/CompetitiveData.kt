package kr.hs.dgsw.donghyeon.domain.entity

import com.google.gson.annotations.SerializedName

data class Competitive(
    @SerializedName("rank")
    val rank : String?,
    @SerializedName("rank_img")
    val rankUrl : String?
)