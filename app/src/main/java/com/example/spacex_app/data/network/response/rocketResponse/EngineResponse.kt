package com.example.spacex_app.data.network.response.rocketResponse

data class EngineResponse(
    var number: Int? = 0,
    var type: String? = "",
    var version: String? = "",
    var layout: String? = "",
    var isp: IspResponse? = IspResponse(),
    var engine_loss_max: Int? = 0,
    var propellant_1: String? = "",
    var propellant_2: String? = "",
    var thrust_sea_level: ThrustSeaLevelResponse? = ThrustSeaLevelResponse(),
    var thrust_vacuum: ThrustVacuumResponse? = ThrustVacuumResponse(),
    var thrust_to_weight: Int? = 0
)