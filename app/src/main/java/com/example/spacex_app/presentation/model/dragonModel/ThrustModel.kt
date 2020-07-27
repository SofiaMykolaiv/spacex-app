package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ThrustModel(
    var kN: Double? = 0.0,
    var lbf: Int? = 0
): Parcelable