package com.example.spacex_app.data.network.response.dragonResponse

import com.google.gson.annotations.SerializedName

data class ThrustResponse(
    @SerializedName(value = "kN") var kN: Double? = 0.0,
    @SerializedName(value = "lbf") var lbf: Int? = 0
)