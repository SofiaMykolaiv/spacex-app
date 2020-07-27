package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.FirstStageResponse
import com.example.spacex_app.presentation.model.rocketModel.FirstStageModel

fun mapResponseToModel(firstStageResponse: FirstStageResponse)= FirstStageModel(
    reusable = firstStageResponse.reusable,
    engines = firstStageResponse.engines,
    fuelAmountTons = firstStageResponse.fuel_amount_tons,
    burnTimeSec = firstStageResponse.burn_time_sec,
    thrustSeaLevel = mapResponseToModel(firstStageResponse.thrust_sea_level!!),
    thrustVacuum = mapResponseToModel(firstStageResponse.thrust_vacuum!!)
)