package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.LandingLegResponse
import com.example.spacex_app.presentation.model.rocketModel.LandingLegModel

fun mapResponseToModel(landingLegResponse: LandingLegResponse) = LandingLegModel(
    number = landingLegResponse.number,
    material = landingLegResponse.material
)