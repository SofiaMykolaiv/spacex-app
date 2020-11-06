package com.example.spacex_app.data.network.response.rocketResponse

import com.google.gson.annotations.SerializedName

data class LandingLegResponse(
    @SerializedName(value = "number") var number: Int? = 0,
    @SerializedName(value = "material") var material: String? = ""
)