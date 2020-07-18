package com.example.spacex_app.presentation.mapper.dragonMapper

import com.example.spacex_app.data.network.response.dragonResponse.ReturnPayloadVolResponse
import com.example.spacex_app.presentation.model.dragonModel.ReturnPayloadVolModel

fun mapResponseToModel(returnPayloadVolResponse: ReturnPayloadVolResponse) = ReturnPayloadVolModel(
    cubicMeters = returnPayloadVolResponse.cubic_meters,
    cubicFeet = returnPayloadVolResponse.cubic_feet
)