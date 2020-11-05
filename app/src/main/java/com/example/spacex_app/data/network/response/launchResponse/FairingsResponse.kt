package com.example.spacex_app.data.network.response.launchResponse

data class FairingsResponse(
    var reused: Boolean? = false,
    var recovery_attempt: Boolean? = false,
    var recovered: String? = "",
    var ship: String? = ""
)