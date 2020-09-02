package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.dragonResponse.DragonResponse
import com.example.spacex_app.data.network.response.rocketResponse.RocketResponse
import com.example.spacex_app.data.network.response.shipResponse.ShipResponse
import com.example.spacex_app.presentation.model.vehicleModel.VehicleModel

fun mapDragonResponseToModel(dragonListResponse: List<DragonResponse>?) =
    dragonListResponse?.let { list ->
        list.map { dragonResponse ->
            VehicleModel(
                id = dragonResponse.id,
                name = dragonResponse.name,
                imageUrl = dragonResponse.flickr_images?.get(0),
                buildDate = dragonResponse.first_flight
            )
        }
    }

fun mapShipResponseToModel(shipListResponse: List<ShipResponse>?) =
    shipListResponse?.let { list ->
        list.map { shipResponse ->
            VehicleModel(
                id = shipResponse.ship_id,
                name = shipResponse.ship_name,
                imageUrl = shipResponse.image,
                buildDate = shipResponse.year_built.toString()
            )
        }
    }

fun mapRocketResponseToModel(rocketListResponse: List<RocketResponse>?) =
    rocketListResponse?.let { list ->
        list.map { rocketResponse ->
            VehicleModel(
                id = rocketResponse.rocket_id,
                name = rocketResponse.rocket_name,
                imageUrl = rocketResponse.flickr_images?.get(0),
                buildDate = rocketResponse.first_flight
            )
        }
    }