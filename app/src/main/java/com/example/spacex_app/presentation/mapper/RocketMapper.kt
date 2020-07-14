package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.RocketResponse
import com.example.spacex_app.presentation.model.RocketModel

fun mapResponseToModel(rocketResponse: RocketResponse) = RocketModel(
    rocketId = rocketResponse.rocket_id,
    rocketName = rocketResponse.rocket_name,
    rocketType = rocketResponse.rocket_type,
    firstStage = mapResponseToModel(rocketResponse.first_stage!!),
    secondStage = mapResponseToModel(rocketResponse.second_stage!!),
    fairings = mapResponseToModel(rocketResponse.fairings!!)
)
