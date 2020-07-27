package com.example.spacex_app.presentation.model.infoModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LinkModel (
    var website: String? = "",
    var flickr: String? = "",
    var twitter: String? = "",
    var elonTwitter: String? = ""
): Parcelable