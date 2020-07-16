package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.dragonResponse.TrunkVolumeResponse
import com.example.spacex_app.presentation.model.dragonModel.TrunkVolumeModel

fun mapResponseToModel(trunkVolumeResponse: TrunkVolumeResponse) = TrunkVolumeModel(
    cubicMeters = trunkVolumeResponse.cubic_meters,
    cubicFeet = trunkVolumeResponse.cubic_feet
)