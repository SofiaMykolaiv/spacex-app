package com.example.spacex_app.data.network.response.dragonResponse

data class HeatShieldResponse(
    var material: String? = "",
    var size_meters: Double? = 0.0,
    var temp_degrees:Int? = 0,
    var dev_partner: String? = ""
)