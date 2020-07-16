package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.dragonResponse.ThrustResponse
import com.example.spacex_app.presentation.model.dragonModel.ThrustModel

fun mapResponseToModel(thrustResponse: ThrustResponse) = ThrustModel(
    kN = thrustResponse.kN,
    lbf = thrustResponse.lbf
)