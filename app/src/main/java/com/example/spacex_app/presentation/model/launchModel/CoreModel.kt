package com.example.spacex_app.presentation.model.launchModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CoreModel (
    var coreSerial: String? = "",
    var flight: String? = "",
    var block: Int? = 0,
    var gridfins: Boolean? = false,
    var legs: String? = "",
    var reused: Boolean? = false,
    var landSuccess: Boolean? = false,
    var landingIntent: Boolean? = false,
    var landingType: String? = "",
    var landingVehicle: String? = ""
): Parcelable