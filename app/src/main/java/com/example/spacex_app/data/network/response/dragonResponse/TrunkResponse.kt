package com.example.spacex_app.data.network.response.dragonResponse

data class TrunkResponse (
    var trunk_volume: TrunkVolumeResponse? = TrunkVolumeResponse(),
    var cargo: CargoResponse? = CargoResponse()
)