package com.example.spacex_app.presentation.mapper.dragonMapper

import com.example.spacex_app.data.network.response.dragonResponse.LaunchPayloadVolResponse
import com.example.spacex_app.presentation.model.dragonModel.LaunchPayloadVolModel

fun mapResponseToModel(launchPayloadVolResponse: LaunchPayloadVolResponse) =
    LaunchPayloadVolModel(
        cubicMeters = launchPayloadVolResponse.cubic_meters,
        cubicFeet = launchPayloadVolResponse.cubic_feet
    )