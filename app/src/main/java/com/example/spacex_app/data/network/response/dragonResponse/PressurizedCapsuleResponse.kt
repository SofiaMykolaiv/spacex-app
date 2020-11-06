package com.example.spacex_app.data.network.response.dragonResponse

import com.google.gson.annotations.SerializedName

data class PressurizedCapsuleResponse(
    @SerializedName(value = "payload_volume") var payload_volume: PayloadVolumeResponse? = PayloadVolumeResponse()
)