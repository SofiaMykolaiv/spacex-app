package com.example.spacex_app.data.network.response.rocketResponse

import com.google.gson.annotations.SerializedName

data class EngineResponse(
    @SerializedName(value = "number") var number: Int? = 0,
    @SerializedName(value = "type") var type: String? = "",
    @SerializedName(value = "version") var version: String? = "",
    @SerializedName(value = "layout") var layout: String? = "",
    @SerializedName(value = "isp") var isp: IspResponse? = IspResponse(),
    @SerializedName(value = "engine_loss_max") var engine_loss_max: Int? = 0,
    @SerializedName(value = "propellant_1") var propellant_1: String? = "",
    @SerializedName(value = "propellant_2") var propellant_2: String? = "",
    @SerializedName(value = "thrust_sea_level") var thrust_sea_level: ThrustSeaLevelResponse? = ThrustSeaLevelResponse(),
    @SerializedName(value = "thrust_vacuum") var thrust_vacuum: ThrustVacuumResponse? = ThrustVacuumResponse(),
    @SerializedName(value = "thrust_to_weight") var thrust_to_weight: Double? = 0.0
)