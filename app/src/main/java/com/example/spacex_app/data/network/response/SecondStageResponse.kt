package com.example.spacex_app.data.network.response

data class SecondStageResponse(
    var block: Int? = 0,
    var payloads: List<PayloadsResponse>? = emptyList()
)