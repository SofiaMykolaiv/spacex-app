package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.FirstStageResponse
import com.example.spacex_app.presentation.model.FirstStageModel

fun mapResponseToModel(firstStageResponse: FirstStageResponse) = FirstStageModel(
    cores = mapResponseToModel(firstStageResponse.cores!!)
)
