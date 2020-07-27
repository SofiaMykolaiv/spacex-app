package com.example.spacex_app.presentation.mapper.infoMapper

import com.example.spacex_app.data.network.response.infoResponse.HeadquartersResponse
import com.example.spacex_app.presentation.model.infoModel.HeadquartersModel

fun mapResponseToModel(headquartersResponse: HeadquartersResponse) =
    HeadquartersModel(
        address = headquartersResponse.address,
        city = headquartersResponse.city,
        state = headquartersResponse.state
    )