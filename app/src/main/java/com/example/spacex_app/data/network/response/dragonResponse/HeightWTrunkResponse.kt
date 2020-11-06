package com.example.spacex_app.data.network.response.dragonResponse

import com.google.gson.annotations.SerializedName

data class HeightWTrunkResponse(
    @SerializedName(value = "meters") var meters: Double? = 0.0,
    @SerializedName(value = "feet") var feet: Double? = 0.0
)