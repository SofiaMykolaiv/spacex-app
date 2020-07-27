package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.RocketResponse
import com.example.spacex_app.presentation.model.rocketModel.RocketModel

fun mapResponseToModel(rocketListResponse: List<RocketResponse>?) =
    rocketListResponse?.let { list ->
        list.map { rocketResponse ->
            RocketModel(
                id = rocketResponse.id,
                active = rocketResponse.active,
                stages = rocketResponse.stages,
                boosters = rocketResponse.boosters,
                costPerLaunch = rocketResponse.cost_per_launch,
                successRatePct = rocketResponse.success_rate_pct,
                firstFlight = rocketResponse.first_flight,
                country = rocketResponse.country,
                company = rocketResponse.company,
                height = mapResponseToModel(rocketResponse.height!!),
                diameter = mapResponseToModel(rocketResponse.diameter!!),
                mass = mapResponseToModel(rocketResponse.mass!!),
                payloadWeights = mapResponseToModel(rocketResponse.payload_weights!!),
                firstStage = mapResponseToModel(rocketResponse.first_stage!!),
                secondStage = mapResponseToModel(rocketResponse.second_stage!!),
                engines = mapResponseToModel(rocketResponse.engines!!),
                landingLegs = mapResponseToModel(rocketResponse.landing_legs!!),
                flickrImages = rocketResponse.flickr_images,
                wikipedia = rocketResponse.wikipedia,
                description = rocketResponse.description,
                rocketId = rocketResponse.rocket_id,
                rocketName = rocketResponse.rocket_name,
                rocketType = rocketResponse.rocket_type
                )
        }
    }