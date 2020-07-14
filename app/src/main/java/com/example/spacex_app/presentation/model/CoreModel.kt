package com.example.spacex_app.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CoreModel (
    var coreSerial: String? = "",
    var flight: String? = "",
    var block: Int? = 0,
    var gridfins: String? = "",
    var legs: String? = "",
    var reused: Boolean? = false,
    var landSuccess: String? = "",
    var landingIntent: String? = "",
    var landingType: String? = "",
    var landingVehicle: String? = ""
): Parcelable