package kr.hs.dgsw.donghyeon.domain.entity.subdata

import com.google.gson.annotations.SerializedName

data class CompetitiveData(
    @SerializedName("level")
    val scoreRole : Int?,
    @SerializedName("role")
    val role : String?,
    @SerializedName("roleIcon")
    val roleIcon : String?,
    @SerializedName("rankIcon")
    val rankIcon : String?,
)