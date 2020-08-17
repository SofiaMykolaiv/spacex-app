package com.example.spacex_app.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LinksModel (
    var missionPatch: String? = "",
    var missionPatchSmall: String? = "",
    var redditCampaign: String? = "",
    var redditLaunch: String? = "",
    var redditRecovery: String? = "",
    var redditMedia: String? = "",
    var presskit: String? = "",
    var articleLink: String? = "",
    var wikipedia: String? = "",
    var videoLink: String? = "",
    var youtubeId: String? = "",
    var flickrImages: List<String>? = emptyList(),
    var reddit: String? = "",
    var article: String? = ""
):Parcelable