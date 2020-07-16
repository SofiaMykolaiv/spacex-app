package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.dragonResponse.PressurizedCapsuleResponse
import com.example.spacex_app.presentation.model.dragonModel.PressurizedCapsuleModel

fun mapResponseToModel(pressurizedCapsuleResponse: PressurizedCapsuleResponse) =
    PressurizedCapsuleModel(
        payloadVolume = mapResponseToModel(pressurizedCapsuleResponse.payload_volume!!)
    )