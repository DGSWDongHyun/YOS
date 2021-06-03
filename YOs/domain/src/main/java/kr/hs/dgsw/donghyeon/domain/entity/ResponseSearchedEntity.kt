package kr.hs.dgsw.donghyeon.domain.entity

import com.google.gson.annotations.SerializedName
import kr.hs.dgsw.donghyeon.domain.entity.subdata.CompetitiveData

data class ResponseSearchedEntity(
    @SerializedName("icon")
    val portraitUrl : String?,
    @SerializedName("name")
    val userName : String?,
    @SerializedName("level")
    val level : String?,
    @SerializedName("prestige")
    val prestige : String?,
    @SerializedName("private")
    val isPrivate : Boolean?,
    @SerializedName("ratings")
    val ratingList : ArrayList<CompetitiveData>?
)