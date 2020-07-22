package com.example.spacex_app.data.network.response.dragonResponse

data class ThrusterResponse(
    var type: String? = "",
    var amount: Int? = 0,
    var pods: Int? = 0,
    var fuel_1: String? = "",
    var fuel_2: String? = "",
    var isp: Int? = 0,
    var thrust: ThrustResponse? = ThrustResponse()
)