package com.example.spacex_app.data.network.response.rocketResponse

import com.google.gson.annotations.SerializedName

data class IspResponse(
    @SerializedName(value = "sea_level") var sea_level: Int? = 0,
    @SerializedName(value = "vacuum") var vacuum: Int? = 0
)