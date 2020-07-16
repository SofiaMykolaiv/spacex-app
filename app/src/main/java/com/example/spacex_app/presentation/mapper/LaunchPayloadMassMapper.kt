package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.dragonResponse.LaunchPayloadMassResponse
import com.example.spacex_app.presentation.model.dragonModel.LaunchPayloadMassModel

fun mapResponseToModel(launchPayloadMassResponse: LaunchPayloadMassResponse) =
    LaunchPayloadMassModel(
        kg = launchPayloadMassResponse.kg,
        lb = launchPayloadMassResponse.lb
    )
