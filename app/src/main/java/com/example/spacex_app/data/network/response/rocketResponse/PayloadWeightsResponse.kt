package com.example.spacex_app.data.network.response.rocketResponse

data class PayloadWeightsResponse(
    var id: String? = "",
    var name: String? = "",
    var kg: Int? = 0,
    var lb: Int? = 0
)