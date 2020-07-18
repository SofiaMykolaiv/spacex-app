package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.CompositeFairingResponse
import com.example.spacex_app.presentation.model.rocketModel.CompositeFairingModel

fun mapResponseToModel(compositeFairingResponse: CompositeFairingResponse) = CompositeFairingModel(
    height = mapResponseToModel(compositeFairingResponse.height!!),
    diameter = mapResponseToModel(compositeFairingResponse.diameter!!)
)