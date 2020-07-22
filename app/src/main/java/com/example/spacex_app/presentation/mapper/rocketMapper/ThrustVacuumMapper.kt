package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.ThrustVacuumResponse
import com.example.spacex_app.presentation.model.rocketModel.ThrustVacuumModel

fun mapResponseToModel(thrustVacuumResponse: ThrustVacuumResponse) = ThrustVacuumModel(
    kN = thrustVacuumResponse.kN,
    lbf = thrustVacuumResponse.lbf
)