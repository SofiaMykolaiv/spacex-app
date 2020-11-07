package com.example.spacex_app.presentation.model.vehicleModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class VehicleModel(
    var id: String? = "",
    var name: String? = "",
    var imageUrl: String? = "",
    var buildDate: String? = "",
    var description : String? = ""
) : Parcelable