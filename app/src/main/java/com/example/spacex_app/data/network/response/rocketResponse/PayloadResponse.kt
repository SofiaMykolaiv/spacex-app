package com.example.spacex_app.data.network.response.rocketResponse

import com.google.gson.annotations.SerializedName

data class PayloadResponse(
    @SerializedName(value = "option_1") var option_1: String? = "",
    @SerializedName(value = "composite_fairing") var composite_fairing: CompositeFairingResponse? = CompositeFairingResponse()
)