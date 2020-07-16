package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.dragonResponse.PayloadVolumeResponse
import com.example.spacex_app.presentation.model.dragonModel.PayloadVolumeModel

fun mapResponseToModel(payloadVolResponse: PayloadVolumeResponse) =
    PayloadVolumeModel(
        cubicMeters = payloadVolResponse.cubic_meters,
        cubicFeet = payloadVolResponse.cubic_feet
    )