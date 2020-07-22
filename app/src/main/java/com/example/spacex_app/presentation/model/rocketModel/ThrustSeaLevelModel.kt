package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ThrustSeaLevelModel (
    var kN: Int? = 0,
    var lbf: Int? = 0
): Parcelable