package com.example.spacex_app.data.network.response.launchResponse

data class CoreResponse(
    var core_serial: String? = "",
    var flight: String? = "",
    var block: Int? = 0,
    var gridfins: Boolean? = false,
    var legs: String? = "",
    var reused: Boolean? = false,
    var land_success: Boolean? = false,
    var landing_intent: Boolean? = false,
    var landing_type: String? = "",
    var landing_vehicle: String? = ""
)