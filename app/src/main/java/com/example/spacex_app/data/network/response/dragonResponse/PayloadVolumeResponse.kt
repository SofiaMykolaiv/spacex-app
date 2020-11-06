package com.example.spacex_app.data.network.response.dragonResponse

import com.google.gson.annotations.SerializedName

data class PayloadVolumeResponse (
    @SerializedName(value = "cubic_meters")  var cubic_meters: Int? = 0,
    @SerializedName(value = "cubic_feet")  var cubic_feet: Int? = 0
)