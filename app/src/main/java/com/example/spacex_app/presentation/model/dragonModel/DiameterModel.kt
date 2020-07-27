package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DiameterModel(
    var meters: Double? = 0.0,
    var feet: Int? = 0
) : Parcelable
