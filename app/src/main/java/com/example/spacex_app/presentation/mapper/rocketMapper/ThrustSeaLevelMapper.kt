package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.ThrustSeaLevelResponse
import com.example.spacex_app.presentation.model.rocketModel.ThrustSeaLevelModel

fun mapResponseToModel(thrustSeaLevelResponse: ThrustSeaLevelResponse) = ThrustSeaLevelModel(
    kN = thrustSeaLevelResponse.kN,
    lbf = thrustSeaLevelResponse.lbf
)