package com.example.spacex_app.data.network.response.rocketResponse

import com.google.gson.annotations.SerializedName

data class MassResponse(
    @SerializedName(value = "kg") var kg: Int? = 0,
    @SerializedName(value = "lb") var lb: Int? = 0
)