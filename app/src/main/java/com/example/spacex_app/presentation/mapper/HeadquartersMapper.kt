package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.HeadquartersResponse
import com.example.spacex_app.presentation.model.HeadquartersModel

fun mapResponseToModel(headquartersResponse: HeadquartersResponse) = HeadquartersModel(
    address = headquartersResponse.address,
    city = headquartersResponse.city,
    state = headquartersResponse.state
)