package com.example.spacex_app.presentation.model.launchModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LaunchModel (
    var flightNumber: Int? = 0,
    var missionName: String? = "",
    var missionId: List<String>? = emptyList(),
    var launchYear: String? = "",
    var launchDateUnix: Long? = 0L,
    var launchDateUtc: String? = "",
    var launchDateLocal: String? = "",
    var isTentative: Boolean? = false,
    var tentativeMaxPrecision: String? = "",
    var tbd: Boolean? = false,
    var launchWindow: String? = "",
    var rocket: RocketModel? = RocketModel(),
    var ships: List<String>? = emptyList(),
    var launchSite: LaunchSiteModel? = LaunchSiteModel(),
    var launchSuccess: String? = "",
    var links: LinksModel? = LinksModel(),
    var details: String? = "",
    var upcoming: Boolean? = false,
    var staticFireDateUtc: String? = "",
    var staticFireDateUnix: String? = "",
    var timeline: String? = ""
): Parcelable