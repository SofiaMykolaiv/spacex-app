package com.example.spacex_app.presentation.mapper.shipMapper

import com.example.spacex_app.data.network.response.shipResponse.ShipResponse
import com.example.spacex_app.presentation.model.shipModel.ShipModel

fun mapResponseToModel(shipResponseList: List<ShipResponse>?) =
    shipResponseList?.let { list ->
        list.map { shipResponse ->
            ShipModel(
                shipId = shipResponse.ship_id,
                shipName = shipResponse.ship_name,
                shipModel = shipResponse.ship_model,
                shipType = shipResponse.ship_type,
                roles = shipResponse.roles,
                active = shipResponse.active,
                imo = shipResponse.imo,
                mmsi = shipResponse.mmsi,
                abs = shipResponse.abs,
                weightLbs = shipResponse.weight_lbs,
                weightKg = shipResponse.weight_kg,
                yearBuilt = shipResponse.year_built,
                homePort = shipResponse.home_port,
                status = shipResponse.status,
                speedKn = shipResponse.speed_kn,
                courseDeg = shipResponse.course_deg,
                position = mapResponseToModel(shipResponse.position!!),
                successfulLandings = shipResponse.successful_landings,
                attemptedLandings = shipResponse.attempted_landings,
                missions = mapResponseToModel(shipResponse.missions!!),
                url = shipResponse.url,
                image = shipResponse.image
            )
        }
    }

fun mapResponseToModel(shipResponse: ShipResponse) = ShipModel(
    shipId = shipResponse.ship_id,
    shipName = shipResponse.ship_name,
    shipModel = shipResponse.ship_model,
    shipType = shipResponse.ship_type,
    roles = shipResponse.roles,
    active = shipResponse.active,
    imo = shipResponse.imo,
    mmsi = shipResponse.mmsi,
    abs = shipResponse.abs,
    weightLbs = shipResponse.weight_lbs,
    weightKg = shipResponse.weight_kg,
    yearBuilt = shipResponse.year_built,
    homePort = shipResponse.home_port,
    status = shipResponse.status,
    speedKn = shipResponse.speed_kn,
    courseDeg = shipResponse.course_deg,
    position = mapResponseToModel(shipResponse.position!!),
    successfulLandings = shipResponse.successful_landings,
    attemptedLandings = shipResponse.attempted_landings,
    missions = mapResponseToModel(shipResponse.missions!!),
    url = shipResponse.url,
    image = shipResponse.image
)