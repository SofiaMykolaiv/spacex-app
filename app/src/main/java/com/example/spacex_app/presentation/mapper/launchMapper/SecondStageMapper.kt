package com.example.spacex_app.presentation.mapper.launchMapper

import com.example.spacex_app.data.network.response.launchResponse.SecondStageResponse
import com.example.spacex_app.presentation.model.launchModel.SecondStageModel

fun mapResponseToModel(secondStageResponse: SecondStageResponse) = SecondStageModel(
    block = secondStageResponse.block,
    payloads = mapResponseToModel(secondStageResponse.payloads!!)
)