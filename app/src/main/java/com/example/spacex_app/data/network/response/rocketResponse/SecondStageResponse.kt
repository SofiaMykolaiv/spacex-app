package com.example.spacex_app.data.network.response.rocketResponse

import com.example.spacex_app.data.network.response.dragonResponse.ThrustResponse
import com.google.gson.annotations.SerializedName

data class SecondStageResponse(
    @SerializedName(value = "reusable") var reusable: Boolean? = false,
    @SerializedName(value = "engines") var engines: Int? = 0,
    @SerializedName(value = "fuel_amount_tons") var fuel_amount_tons: Double? = 0.0,
    @SerializedName(value = "burn_time_sec") var burn_time_sec: Int? = 0,
    @SerializedName(value = "thrust") var thrust: ThrustResponse? = ThrustResponse(),
    @SerializedName(value = "payloads") var payloads: PayloadResponse? = PayloadResponse()
)