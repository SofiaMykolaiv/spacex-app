package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import com.example.spacex_app.data.network.response.dragonResponse.ThrustResponse
import com.example.spacex_app.data.network.response.rocketResponse.PayloadResponse
import com.example.spacex_app.presentation.model.dragonModel.ThrustModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SecondStageModel (
    var reusable: Boolean? = false,
    var engines: Int? = 0,
    var fuelAmountTons: Double? = 0.0,
    var burnTimeSec: Int? = 0,
    var thrust: ThrustModel? = ThrustModel(),
    var payloads: PayloadModel? = PayloadModel()
): Parcelable