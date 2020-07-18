package com.example.spacex_app.data.network.response.shipResponse

data class ShipResponse(
    var ship_id: String? = "",
    var ship_name: String? = "",
    var ship_model: String? = "",
    var ship_type: String? = "",
    var roles: List<String>? = arrayListOf(),
    var active: Boolean? = false,
    var imo: Long? = 0L,
    var mmsi: Long? = 0L,
    var abs: Long? = 0L,
    var weight_lbs: Long? = 0L,
    var weight_kg: Int? = 0,
    var year_built: Int? = 0,
    var home_port: String? = "",
    var status: String? = "",
    var speed_kn: String? = "",
    var course_deg: String? = "",
    var position: PositionResponse? = PositionResponse(),
    var successful_landings:String? = "",
    var attempted_landings: String? = "",
    var missions: List<MissionResponse>? = emptyList(),
    var url: String? = "",
    var image: String? = ""
)