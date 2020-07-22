package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.PayloadResponse
import com.example.spacex_app.presentation.model.rocketModel.PayloadModel

fun mapResponseToModel(payloadResponse: PayloadResponse) = PayloadModel(
    option1 = payloadResponse.option_1,
    compositeFairing = mapResponseToModel(payloadResponse.composite_fairing!!)
)