package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.dragonResponse.CargoResponse
import com.example.spacex_app.presentation.model.dragonModel.CargoModel

fun mapResponseToModel(cargoResponse: CargoResponse) = CargoModel(
    solarArray = cargoResponse.solar_array,
    unpressurizedCargo = cargoResponse.unpressurized_cargo
)