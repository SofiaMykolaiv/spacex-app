package com.example.spacex_app.presentation.mapper.dragonMapper

import com.example.spacex_app.data.network.response.dragonResponse.TrunkResponse
import com.example.spacex_app.presentation.model.dragonModel.TrunkModel

fun mapResponseToModel(trunkResponse: TrunkResponse)= TrunkModel(
    trunkVolume = mapResponseToModel(
        trunkResponse.trunk_volume!!
    ),
    cargo = mapResponseToModel(
        trunkResponse.cargo!!
    )
)