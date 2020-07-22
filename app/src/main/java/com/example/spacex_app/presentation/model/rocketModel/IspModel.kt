package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class IspModel (
    var seaLevel: Int? = 0,
    var vacuum: Int? = 0
): Parcelable