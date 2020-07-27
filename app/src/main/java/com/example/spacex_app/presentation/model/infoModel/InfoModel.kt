package com.example.spacex_app.presentation.model.infoModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class InfoModel(
    var name: String? = "",
    var founder: String? = "",
    var employees: Int? = 0,
    var vehicles: Int? = 0,
    var launchSites: Int? = 0,
    var testSites: Int? = 0,
    var ceo: String? = "",
    var cto: String? = "",
    var coo: String? = "",
    var ctoPropulsion: String? = "",
    var valuation: Long? = 0L,
    var headquarters: HeadquartersModel? = HeadquartersModel(),
    var links: LinkModel? = LinkModel(),
    var summary: String? = ""
) : Parcelable