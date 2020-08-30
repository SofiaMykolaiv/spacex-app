package com.example.spacex_app.presentation.mapper.launchMapper

import com.example.spacex_app.data.network.response.launchResponse.FirstStageResponse
import com.example.spacex_app.presentation.model.launchModel.FirstStageModel

fun mapResponseToModel(firstStageResponse: FirstStageResponse) = FirstStageModel(
    cores = mapResponseToModel(firstStageResponse.cores!!)
)
