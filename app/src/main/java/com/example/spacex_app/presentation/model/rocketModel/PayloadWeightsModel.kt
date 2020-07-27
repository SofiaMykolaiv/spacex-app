package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PayloadWeightsModel (
    var id: String? = "",
    var name: String? = "",
    var kg: Int? = 0,
    var lb: Int? = 0
): Parcelable