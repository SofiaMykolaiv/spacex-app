package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.EngineResponse
import com.example.spacex_app.presentation.model.rocketModel.EngineModel

fun mapResponseToModel(engineResponse: EngineResponse) = EngineModel(
    number = engineResponse.number,
    type = engineResponse.type,
    version = engineResponse.version,
    layout = engineResponse.layout,
    isp = mapResponseToModel(engineResponse.isp!!),
    engineLossMax = engineResponse.engine_loss_max,
    propellant1 = engineResponse.propellant_1,
    propellant2 = engineResponse.propellant_2,
    thrustSeaLevel = mapResponseToModel(engineResponse.thrust_sea_level!!),
    thrustVacuum = mapResponseToModel(engineResponse.thrust_vacuum!!),
    thrustToWeight = engineResponse.thrust_to_weight
)