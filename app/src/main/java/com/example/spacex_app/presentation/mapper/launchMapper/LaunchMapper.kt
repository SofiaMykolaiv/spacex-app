package com.example.spacex_app.presentation.mapper.launchMapper

import com.example.spacex_app.data.network.response.launchResponse.LaunchResponse
import com.example.spacex_app.presentation.model.launchModel.LaunchModel

fun mapResponseToModel(launchResponse: LaunchResponse) = LaunchModel(
    flightNumber = launchResponse.flight_number,
    missionName = launchResponse.mission_name,
    missionId = launchResponse.mission_id,
    launchYear = launchResponse.launch_year,
    launchDateUnix = launchResponse.launch_date_unix,
    launchDateUtc = launchResponse.launch_date_utc,
    launchDateLocal = launchResponse.launch_date_local,
    isTentative = launchResponse.is_tentative,
    tentativeMaxPrecision = launchResponse.tentative_max_precision,
    tbd = launchResponse.tbd,
    launchWindow = launchResponse.launch_window,
    rocket = mapResponseToModel(launchResponse.rocket!!),
    ships = launchResponse.ships,
    launchSite = mapResponseToModel(launchResponse.launch_site!!),
    launchSuccess = launchResponse.launch_success,
    links = mapResponseToModel(launchResponse.links!!),
    details = launchResponse.details,
    upcoming = launchResponse.upcoming,
    staticFireDateUtc = launchResponse.static_fire_date_utc,
    staticFireDateUnix = launchResponse.static_fire_date_unix,
    timeline = launchResponse.timeline,
    crew = launchResponse.crew
)