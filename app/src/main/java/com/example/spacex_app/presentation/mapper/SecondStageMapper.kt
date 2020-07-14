package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.SecondStageResponse
import com.example.spacex_app.presentation.model.SecondStageModel

fun mapResponseToModel(secondStageResponse: SecondStageResponse) = SecondStageModel(
    block = secondStageResponse.block,
    payloads = mapResponseToModel(secondStageResponse.payloads!!)
)