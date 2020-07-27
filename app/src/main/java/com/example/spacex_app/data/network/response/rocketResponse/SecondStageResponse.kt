package com.example.spacex_app.data.network.response.rocketResponse

import com.example.spacex_app.data.network.response.dragonResponse.ThrustResponse

data class SecondStageResponse (
    var reusable: Boolean? = false,
    var engines: Int? = 0,
    var fuel_amount_tons: Double? = 0.0,
    var burn_time_sec: Int? = 0,
    var thrust: ThrustResponse? = ThrustResponse(),
    var payloads: PayloadResponse? = PayloadResponse()
    )