package com.example.spacex_app.data.network.response.shipResponse

import com.google.gson.annotations.SerializedName

data class ShipResponse(
    @SerializedName(value = "ship_id") var ship_id: String = "",
    @SerializedName(value = "ship_name") var ship_name: String? = "",
    @SerializedName(value = "ship_model") var ship_model: String? = "",
    @SerializedName(value = "ship_type") var ship_type: String? = "",
    @SerializedName(value = "roles") var roles: List<String>? = arrayListOf(),
    @SerializedName(value = "active") var active: Boolean? = false,
    @SerializedName(value = "imo") var imo: Long? = 0L,
    @SerializedName(value = "mmsi") var mmsi: Long? = 0L,
    @SerializedName(value = "abs") var abs: Long? = 0L,
    @SerializedName(value = "weight_lbs") var weight_lbs: Long? = 0L,
    @SerializedName(value = "weight_kg") var weight_kg: Int? = 0,
    @SerializedName(value = "year_built") var year_built: Int? = 0,
    @SerializedName(value = "home_port") var home_port: String? = "",
    @SerializedName(value = "status") var status: String? = "",
    @SerializedName(value = "speed_kn") var speed_kn: String? = "",
    @SerializedName(value = "course_deg") var course_deg: String? = "",
    @SerializedName(value = "position") var position: PositionResponse? = PositionResponse(),
    @SerializedName(value = "successful_landings") var successful_landings: String? = "",
    @SerializedName(value = "attempted_landings") var attempted_landings: String? = "",
    @SerializedName(value = "missions") var missions: List<MissionResponse>? = emptyList(),
    @SerializedName(value = "url") var url: String? = "",
    @SerializedName(value = "image") var image: String? = ""
)