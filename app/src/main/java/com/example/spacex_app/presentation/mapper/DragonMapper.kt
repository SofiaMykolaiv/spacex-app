package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.dragonResponse.DragonResponse
import com.example.spacex_app.presentation.model.dragonModel.DragonModel

fun mapResponseToModel(dragonResponseList: List<DragonResponse>?) =
    dragonResponseList?.let { list ->
        list.map { dragonResponse ->
            DragonModel(
                id = dragonResponse.id,
                name = dragonResponse.name,
                type = dragonResponse.type,
                active = dragonResponse.active,
                crewCapacity = dragonResponse.crew_capacity,
                sidewallAngleDeg = dragonResponse.sidewall_angle_deg,
                orbitDurationYr = dragonResponse.orbit_duration_yr,
                dryMassKg = dragonResponse.dry_mass_kg,
                dryMassLb = dragonResponse.dry_mass_lb,
                firstFlight = dragonResponse.first_flight,
                heatShield = mapResponseToModel(dragonResponse.heat_shield!!),
                thrusters = mapResponseToModel(dragonResponse.thrusters!!),
                launchPayloadMass = mapResponseToModel(dragonResponse.launch_payload_mass!!),
                launchPayloadVol = mapResponseToModel(dragonResponse.launch_payload_vol!!),
                returnPayloadMass = mapResponseToModel(dragonResponse.return_payload_mass!!),
                returnPayloadVol = mapResponseToModel(dragonResponse.return_payload_vol!!),
                pressurizedCapsule = mapResponseToModel(dragonResponse.pressurized_capsule!!),
                trunk = mapResponseToModel(dragonResponse.trunk!!),
                heightWTrunk = mapResponseToModel(dragonResponse.height_w_trunk!!),
                diameter = mapResponseToModel(dragonResponse.diameter!!),
                flickrImages = dragonResponse.flickr_images,
                wikipedia = dragonResponse.wikipedia,
                description = dragonResponse.description
            )
        }
    }
