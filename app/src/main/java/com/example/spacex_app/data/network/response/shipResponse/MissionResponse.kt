package com.example.spacex_app.data.network.response.shipResponse

import com.google.gson.annotations.SerializedName

data class MissionResponse(
    @SerializedName(value = "name") var name: String? = "",
    @SerializedName(value = "flighr") var flighr: Int? = 0
)