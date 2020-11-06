package com.example.spacex_app.data.network.response.dragonResponse

import com.google.gson.annotations.SerializedName

data class LaunchPayloadMassResponse (
    @SerializedName(value = "kg") var kg: Int? = 0,
    @SerializedName(value = "lb") var lb: Int? = 0
)