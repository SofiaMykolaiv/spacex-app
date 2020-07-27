package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.SecondStageResponse
import com.example.spacex_app.presentation.model.rocketModel.SecondStageModel

fun mapResponseToModel(secondStageResponse: SecondStageResponse) = SecondStageModel(
    reusable = secondStageResponse.reusable,
    engines = secondStageResponse.engines,
    fuelAmountTons = secondStageResponse.fuel_amount_tons,
    burnTimeSec = secondStageResponse.burn_time_sec,
    thrust = mapResponseToModel(secondStageResponse.thrust!!),
    payloads = mapResponseToModel(secondStageResponse.payloads!!)
)