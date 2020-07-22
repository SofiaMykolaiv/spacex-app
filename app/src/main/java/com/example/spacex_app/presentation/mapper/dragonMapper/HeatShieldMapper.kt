package com.example.spacex_app.presentation.mapper.dragonMapper

import com.example.spacex_app.data.network.response.dragonResponse.HeatShieldResponse
import com.example.spacex_app.presentation.model.dragonModel.HeatShieldModel

fun mapResponseToModel(heatShieldResponse: HeatShieldResponse) = HeatShieldModel(
    material = heatShieldResponse.material,
    size_meters = heatShieldResponse.size_meters,
    temp_degrees = heatShieldResponse.temp_degrees,
    dev_partner = heatShieldResponse.dev_partner
)