package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HeighWTrunkModel(
    var meters: Double? = 0.0,
    var feet: Double? = 0.0
) : Parcelable