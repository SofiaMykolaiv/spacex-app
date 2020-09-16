package com.example.spacex_app.data.network.response.launchResponse

data class FairingsResponse(
    var reused: String? = "",
    var recovery_attempt: String? = "",
    var recovered: String? = "",
    var ship: String? = ""
)