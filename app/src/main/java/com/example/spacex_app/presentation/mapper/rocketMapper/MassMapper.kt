package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.MassResponse
import com.example.spacex_app.presentation.model.rocketModel.MassModel

fun mapResponseToModel(massResponse: MassResponse) = MassModel(
    kg = massResponse.kg,
    lb = massResponse.lb
)