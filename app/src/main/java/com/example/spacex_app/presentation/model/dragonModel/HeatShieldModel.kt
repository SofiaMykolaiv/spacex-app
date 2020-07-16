package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HeatShieldModel(
    var material: String? = "",
    var size_meters: Double? = 0.0,
    var temp_degrees: Int? = 0,
    var dev_partner: String? = ""
) : Parcelable