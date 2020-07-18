package com.example.spacex_app.data.network.response.rocketResponse

data class PayloadResponse (
    var option_1: String? = "",
    var composite_fairing: CompositeFairingResponse? = CompositeFairingResponse()
)