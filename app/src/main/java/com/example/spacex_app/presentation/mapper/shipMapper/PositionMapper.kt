package com.example.spacex_app.presentation.mapper.shipMapper

import com.example.spacex_app.data.network.response.shipResponse.PositionResponse
import com.example.spacex_app.presentation.model.shipModel.PositionModel

fun mapResponseToModel(positionResponse: PositionResponse) = PositionModel(
    latitude = positionResponse.latitude,
    longitude = positionResponse.longitude
)