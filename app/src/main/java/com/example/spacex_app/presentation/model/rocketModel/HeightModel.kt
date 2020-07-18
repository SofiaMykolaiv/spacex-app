package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HeightModel(
    var meters: Double? = 0.00,
    var feet: Int? = 0
) : Parcelable