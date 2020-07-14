package com.example.spacex_app.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LaunchSiteModel (
    var siteId: String? = "",
    var siteName: String? = "",
    var siteNameLong: String? = ""
):Parcelable