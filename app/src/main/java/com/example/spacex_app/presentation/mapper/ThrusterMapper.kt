package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.dragonResponse.ThrusterResponse
import com.example.spacex_app.presentation.model.dragonModel.ThrusterModel

fun mapResponseToModel(thrusterListResponse: List<ThrusterResponse>?) =
    thrusterListResponse?.let { list ->
        list.map { thrusterResponse ->
            ThrusterModel(
                type = thrusterResponse.type,
                amount = thrusterResponse.amount,
                pods = thrusterResponse.pods,
                fuel_1 = thrusterResponse.fuel_1,
                fuel_2 = thrusterResponse.fuel_2,
                isp = thrusterResponse.isp,
                thrust = mapResponseToModel(thrusterResponse.thrust!!)
            )
        }
    }
