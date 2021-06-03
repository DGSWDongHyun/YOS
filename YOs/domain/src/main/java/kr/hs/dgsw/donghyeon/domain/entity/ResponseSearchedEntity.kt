package kr.hs.dgsw.donghyeon.domain.entity

import com.google.gson.annotations.SerializedName

data class ResponseSearchedEntity(
    @SerializedName("username")
    val userName : String?,
    @SerializedName("level")
    val level : Int?,
    @SerializedName("portrait")
    val portraitUrl : String?,
    @SerializedName("endorsement")
    val recommendedData : RecommendData?,
    @SerializedName("private")
    val isPrivate : Boolean?,
    @SerializedName("games")
    val gameData : GameData,
    @SerializedName("competitive")
    val competitiveData: Competitive,
    @SerializedName("levelFrame")
    val levelUrl : String?,
    @SerializedName("star")
    val starUrl : String?
)