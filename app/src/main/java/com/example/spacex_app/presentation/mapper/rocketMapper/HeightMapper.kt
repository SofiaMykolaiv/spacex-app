package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.HeightResponse
import com.example.spacex_app.presentation.model.rocketModel.HeightModel

fun mapResponseToModel(heightResponse: HeightResponse) = HeightModel(
    meters = heightResponse.meters,
    feet = heightResponse.feet
)