package com.example.spacex_app.presentation.model.shipModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MissionModel (
    var name: String? = "",
    var flighr: Int? = 0
): Parcelable