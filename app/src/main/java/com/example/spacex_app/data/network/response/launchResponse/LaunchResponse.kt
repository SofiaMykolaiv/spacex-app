package com.example.spacex_app.data.network.response.launchResponse

data class LaunchResponse(
    var flight_number: Int? = 0,
    var mission_name: String? = "",
    var mission_id: List<String>? = emptyList(),
    var launch_year: String? = "",
    var launch_date_unix: Long? = 0L,
    var launch_date_utc: String? = "",
    var launch_date_local: String? = "",
    var is_tentative: Boolean? = false,
    var tentative_max_precision: String? = "",
    var tbd: Boolean? = false,
    var launch_window: String? = "",
    var rocket: RocketResponse? = RocketResponse(),
    var ships: List<String>? = emptyList(),
    var launch_site: LaunchSiteResponse? = LaunchSiteResponse(),
    var launch_success: String? = "",
    var links: LinksResponse? = LinksResponse(),
    var details: String? = "",
    var upcoming: Boolean? = false,
    var static_fire_date_utc: String? = "",
    var static_fire_date_unix: String? = "",
    var timeline: String? = ""
)