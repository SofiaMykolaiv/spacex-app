package com.example.spacex_app.data.network.response.rocketResponse

import com.google.gson.annotations.SerializedName

data class PayloadWeightsResponse(
    @SerializedName(value = "id") var id: String? = "",
    @SerializedName(value = "name") var name: String? = "",
    @SerializedName(value = "kg") var kg: Int? = 0,
    @SerializedName(value = "lb") var lb: Int? = 0
)