package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.FairingsResponse
import com.example.spacex_app.presentation.model.FairingsModel

fun mapResponseToModel(fairingsResponse: FairingsResponse) = FairingsModel(
    reused = fairingsResponse.reused,
    recoveryAttempt = fairingsResponse.recovery_attempt,
    recovered = fairingsResponse.recovered,
    ship = fairingsResponse.ship
)