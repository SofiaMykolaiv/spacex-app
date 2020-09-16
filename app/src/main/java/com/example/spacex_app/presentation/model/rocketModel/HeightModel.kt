package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HeightModel(
    var meters: Double? = 0.0,
    var feet: Double? = 0.0
) : Parcelable