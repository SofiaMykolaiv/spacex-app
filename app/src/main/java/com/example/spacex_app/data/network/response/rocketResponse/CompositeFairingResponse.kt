package com.example.spacex_app.data.network.response.rocketResponse

import com.example.spacex_app.data.network.response.dragonResponse.DiameterResponse
import com.google.gson.annotations.SerializedName

data class CompositeFairingResponse(
    @SerializedName(value = "height") var height: HeightResponse? = HeightResponse(),
    @SerializedName(value = "diameter") var diameter: DiameterResponse? = DiameterResponse()
)