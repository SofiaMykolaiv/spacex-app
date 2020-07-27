package com.example.spacex_app.data.network.response.rocketResponse

data class FirstStageResponse(
    var reusable: Boolean? = false,
    var engines: Int? = 0,
    var fuel_amount_tons: Double? = 0.00,
    var burn_time_sec: Int? = 0,
    var thrust_sea_level: ThrustSeaLevelResponse? = ThrustSeaLevelResponse(),
    var thrust_vacuum: ThrustVacuumResponse? = ThrustVacuumResponse()
)