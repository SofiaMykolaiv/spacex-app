package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.dragonResponse.DiameterResponse
import com.example.spacex_app.presentation.model.dragonModel.DiameterModel

fun mapResponseToModel(diameterResponse: DiameterResponse) = DiameterModel(
    meters = diameterResponse.meters,
    feet = diameterResponse.feet
)