package com.example.spacex_app.presentation.mapper.launchMapper

import com.example.spacex_app.data.network.response.launchResponse.CoreResponse
import com.example.spacex_app.presentation.model.launchModel.CoreModel

fun mapResponseToModel(coreResponseList: List<CoreResponse>?) =
    coreResponseList?.let { list ->
        list.map { coreResponse ->
            CoreModel(
                coreSerial = coreResponse.core_serial,
                flight = coreResponse.flight,
                block = coreResponse.block,
                gridfins = coreResponse.gridfins,
                legs = coreResponse.legs,
                reused = coreResponse.reused,
                landSuccess = coreResponse.land_success,
                landingIntent = coreResponse.landing_intent,
                landingType = coreResponse.landing_type,
                landingVehicle = coreResponse.landing_vehicle
            )
        }
    }