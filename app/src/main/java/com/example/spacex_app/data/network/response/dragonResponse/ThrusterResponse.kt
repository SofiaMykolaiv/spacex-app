package com.example.spacex_app.data.network.response.dragonResponse

import com.google.gson.annotations.SerializedName

data class ThrusterResponse(
    @SerializedName(value = "type") var type: String? = "",
    @SerializedName(value = "amount") var amount: Int? = 0,
    @SerializedName(value = "pods") var pods: Int? = 0,
    @SerializedName(value = "fuel_1") var fuel_1: String? = "",
    @SerializedName(value = "fuel_2") var fuel_2: String? = "",
    @SerializedName(value = "isp") var isp: Int? = 0,
    @SerializedName(value = "thrust") var thrust: ThrustResponse? = ThrustResponse()
)