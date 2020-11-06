package com.example.spacex_app.data.network.response.rocketResponse

import com.google.gson.annotations.SerializedName

data class ThrustSeaLevelResponse(
    @SerializedName(value = "kN") var kN: Int? = 0,
    @SerializedName(value = "lbf") var lbf: Int? = 0
)