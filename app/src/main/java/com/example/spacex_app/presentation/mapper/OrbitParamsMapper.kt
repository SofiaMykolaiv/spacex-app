package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.OrbitParamsResponse
import com.example.spacex_app.presentation.model.OrbitParamsModel

fun mapResponseToModel(orbitParamsResponse: OrbitParamsResponse) = OrbitParamsModel(
    referenceSystem = orbitParamsResponse.reference_system,
    regime = orbitParamsResponse.regime,
    longitude = orbitParamsResponse.longitude,
    semiMajorAxisKm = orbitParamsResponse.semi_major_axis_km,
    eccentricity = orbitParamsResponse.eccentricity,
    periapsisKm = orbitParamsResponse.periapsis_km,
    apoapsisKm = orbitParamsResponse.apoapsis_km,
    inclinationDeg = orbitParamsResponse.inclination_deg,
    periodMin = orbitParamsResponse.period_min,
    lifespanYears = orbitParamsResponse.lifespan_years,
    epoch = orbitParamsResponse.epoch,
    meanMotion = orbitParamsResponse.mean_motion,
    raan = orbitParamsResponse.raan,
    argOfPericenter = orbitParamsResponse.arg_of_pericenter,
    meanAnomaly = orbitParamsResponse.mean_anomaly
)