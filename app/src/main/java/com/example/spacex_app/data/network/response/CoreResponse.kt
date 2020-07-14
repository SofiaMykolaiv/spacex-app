package com.example.spacex_app.data.network.response

data class CoreResponse(
    var core_serial: String? = "",
    var flight: String? = "",
    var block: Int? = 0,
    var gridfins: String? = "",
    var legs: String? = "",
    var reused: Boolean? = false,
    var land_success: String? = "",
    var landing_intent: String? = "",
    var landing_type: String? = "",
    var landing_vehicle: String? = ""
)