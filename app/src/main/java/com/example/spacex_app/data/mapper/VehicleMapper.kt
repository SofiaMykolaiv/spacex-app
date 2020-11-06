package com.example.spacex_app.data.mapper

import com.example.spacex_app.data.database.entity.DragonEntity
import com.example.spacex_app.data.database.entity.RocketEntity
import com.example.spacex_app.data.database.entity.ShipEntity
import com.example.spacex_app.data.network.response.dragonResponse.DragonResponse
import com.example.spacex_app.data.network.response.rocketResponse.RocketResponse
import com.example.spacex_app.data.network.response.shipResponse.ShipResponse

fun mapDragonResponseToEntity(dragonListResponse: List<DragonResponse>?) =
    dragonListResponse?.let { list ->
        list.map { dragonResponse ->
            DragonEntity(
                id = dragonResponse.id,
                name = dragonResponse.name,
                imageUrl = dragonResponse.flickr_images?.get(0),
                buildDate = dragonResponse.first_flight
            )
        }
    }

fun mapShipResponseToEntity(shipListResponse: List<ShipResponse>?) =
    shipListResponse?.let { list ->
        list.map { shipResponse ->
            ShipEntity(
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
            RocketEntity(
                id = rocketResponse.rocket_id,
                name = rocketResponse.rocket_name,
                imageUrl = rocketResponse.flickr_images?.get(0),
                buildDate = rocketResponse.first_flight
            )
        }
    }