package com.example.spacex_app.data.network.response.dragonResponse

import com.google.gson.annotations.SerializedName

data class HeatShieldResponse(
    @SerializedName(value = "material") var material: String? = "",
    @SerializedName(value = "size_meters") var size_meters: Double? = 0.0,
    @SerializedName(value = "temp_degrees") var temp_degrees: Int? = 0,
    @SerializedName(value = "dev_partner") var dev_partner: String? = ""
)