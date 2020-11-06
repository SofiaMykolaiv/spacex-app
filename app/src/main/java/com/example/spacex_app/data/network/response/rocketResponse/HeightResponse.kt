package com.example.spacex_app.data.network.response.rocketResponse

import com.google.gson.annotations.SerializedName

data class HeightResponse(
    @SerializedName(value = "meters") var meters: Double? = 0.0,
    @SerializedName(value = "feet") var feet: Double? = 0.0
)