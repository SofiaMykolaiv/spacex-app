package com.example.spacex_app.data.network.response.dragonResponse

import com.google.gson.annotations.SerializedName

data class TrunkResponse(
    @SerializedName(value = "trunk_volume") var trunk_volume: TrunkVolumeResponse? = TrunkVolumeResponse(),
    @SerializedName(value = "cargo") var cargo: CargoResponse? = CargoResponse()
)