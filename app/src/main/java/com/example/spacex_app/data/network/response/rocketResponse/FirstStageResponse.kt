package com.example.spacex_app.data.network.response.rocketResponse

import com.google.gson.annotations.SerializedName

data class FirstStageResponse(
    @SerializedName(value = "reusable") var reusable: Boolean? = false,
    @SerializedName(value = "engines") var engines: Int? = 0,
    @SerializedName(value = "fuel_amount_tons") var fuel_amount_tons: Double? = 0.00,
    @SerializedName(value = "burn_time_sec") var burn_time_sec: Int? = 0,
    @SerializedName(value = "thrust_sea_level") var thrust_sea_level: ThrustSeaLevelResponse? = ThrustSeaLevelResponse(),
    @SerializedName(value = "thrust_vacuum") var thrust_vacuum: ThrustVacuumResponse? = ThrustVacuumResponse()
)