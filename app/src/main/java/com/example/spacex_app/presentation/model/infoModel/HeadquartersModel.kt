package com.example.spacex_app.presentation.model.infoModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HeadquartersModel(
    var address: String? = "",
    var city: String? = "",
    var state: String? = ""
) : Parcelable