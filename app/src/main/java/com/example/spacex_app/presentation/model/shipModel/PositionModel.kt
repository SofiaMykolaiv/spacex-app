package com.example.spacex_app.presentation.model.shipModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PositionModel(
    var latitude: String? = "",
    var longitude: String? = ""
) : Parcelable