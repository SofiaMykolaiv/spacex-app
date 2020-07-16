package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import com.example.spacex_app.data.network.response.ThrustResponse
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ThrusterModel(
    var type: String? = "",
    var amount: Int? = 0,
    var pods: Int? = 0,
    var fuel_1: String? = "",
    var fuel_2: String? = "",
    var isp: Int? = 0,
    var thrust: ThrustModel? = ThrustModel()
): Parcelable