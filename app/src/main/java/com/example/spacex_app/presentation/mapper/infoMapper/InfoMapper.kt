package com.example.spacex_app.presentation.mapper.infoMapper

import com.example.spacex_app.data.network.response.infoResponse.InfoResponse
import com.example.spacex_app.presentation.model.infoModel.InfoModel

fun mapResponseToModel(infoResponse: InfoResponse) =
    InfoModel(
        name = infoResponse.name,
        founder = infoResponse.founder,
        employees = infoResponse.employees,
        vehicles = infoResponse.vehicles,
        launchSites = infoResponse.launch_sites,
        testSites = infoResponse.test_sites,
        ceo = infoResponse.ceo,
        cto = infoResponse.cto,
        coo = infoResponse.coo,
        ctoPropulsion = infoResponse.cto_propulsion,
        valuation = infoResponse.valuation,
        headquarters = mapResponseToModel(
            infoResponse.headquarters!!
        ),
        links = mapResponseToModel(
            infoResponse.links!!
        )
    )