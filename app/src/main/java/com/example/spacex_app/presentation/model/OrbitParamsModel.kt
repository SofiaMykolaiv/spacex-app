package com.example.spacex_app.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class OrbitParamsModel(
    var referenceSystem: String? = "",
    var regime: String? = "",
    var longitude: String? = "",
    var semiMajorAxisKm: String? = "",
    var eccentricity: String? = "",
    var periapsisKm: String? = "",
    var apoapsisKm: String? = "",
    var inclinationDeg: String? = "",
    var periodMin: String? = "",
    var lifespanYears: Int? = 0,
    var epoch: String? = "",
    var meanMotion: String? = "",
    var raan: String? = "",
    var argOfPericenter: String? = "",
    var meanAnomaly: String? = ""
) : Parcelable