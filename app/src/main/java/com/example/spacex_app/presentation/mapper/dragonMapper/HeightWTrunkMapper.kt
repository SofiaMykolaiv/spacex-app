package com.example.spacex_app.presentation.mapper.dragonMapper

import com.example.spacex_app.data.network.response.dragonResponse.HeightWTrunkResponse
import com.example.spacex_app.presentation.model.dragonModel.HeighWTrunkModel

fun mapResponseToModel(heightWTrunkResponse: HeightWTrunkResponse) =
    HeighWTrunkModel(
        meters = heightWTrunkResponse.meters,
        feet = heightWTrunkResponse.feet
    )