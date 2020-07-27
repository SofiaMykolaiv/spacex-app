package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TrunkVolumeModel(
    var cubicMeters: Int? = 0,
    var cubicFeet: Int? = 0
) : Parcelable