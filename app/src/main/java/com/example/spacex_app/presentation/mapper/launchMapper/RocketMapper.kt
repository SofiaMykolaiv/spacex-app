package com.example.spacex_app.presentation.mapper.launchMapper

import com.example.spacex_app.data.network.response.launchResponse.RocketResponse
import com.example.spacex_app.presentation.model.launchModel.RocketModel

fun mapResponseToModel(rocketResponse: RocketResponse) = RocketModel(
    rocketId = rocketResponse.rocket_id,
    rocketName = rocketResponse.rocket_name,
    rocketType = rocketResponse.rocket_type,
    firstStage = mapResponseToModel(rocketResponse.first_stage!!),
    secondStage = mapResponseToModel(rocketResponse.second_stage!!),
    fairings = mapResponseToModel(rocketResponse.fairings)
)
