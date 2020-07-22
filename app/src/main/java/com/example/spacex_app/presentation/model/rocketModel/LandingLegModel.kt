package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LandingLegModel (
    var number: Int? = 0,
    var material: String? = ""
): Parcelable