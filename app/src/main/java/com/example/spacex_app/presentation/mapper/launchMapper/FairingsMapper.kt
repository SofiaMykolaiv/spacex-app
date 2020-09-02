package com.example.spacex_app.presentation.mapper.launchMapper

import com.example.spacex_app.data.network.response.launchResponse.FairingsResponse
import com.example.spacex_app.presentation.model.launchModel.FairingsModel

fun mapResponseToModel(fairingsResponse: FairingsResponse) = FairingsModel(
    reused = fairingsResponse.reused,
    recoveryAttempt = fairingsResponse.recovery_attempt,
    recovered = fairingsResponse.recovered,
    ship = fairingsResponse.ship
)