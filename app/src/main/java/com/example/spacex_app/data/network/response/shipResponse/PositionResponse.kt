package com.example.spacex_app.data.network.response.shipResponse

import com.google.gson.annotations.SerializedName

data class PositionResponse (
    @SerializedName(value = "latitude") var latitude: String? = "",
    @SerializedName(value = "longitude") var longitude: String? = ""
)