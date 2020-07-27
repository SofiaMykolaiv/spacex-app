package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.IspResponse
import com.example.spacex_app.presentation.model.rocketModel.IspModel

fun mapResponseToModel(ispResponse: IspResponse) = IspModel(
    seaLevel = ispResponse.sea_level,
    vacuum = ispResponse.vacuum
)