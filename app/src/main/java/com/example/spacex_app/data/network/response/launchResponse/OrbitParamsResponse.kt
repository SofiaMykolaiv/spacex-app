package com.example.spacex_app.data.network.response.launchResponse

data class OrbitParamsResponse(
    var reference_system: String? = "",
    var regime: String? = "",
    var longitude: String? = "",
    var semi_major_axis_km: String? = "",
    var eccentricity: String? = "",
    var periapsis_km: String? = "",
    var apoapsis_km: String? = "",
    var inclination_deg: String? = "",
    var period_min: String? = "",
    var lifespan_years: Int? = 0,
    var epoch: String? = "",
    var mean_motion: String? = "",
    var raan: String? = "",
    var arg_of_pericenter: String? = "",
    var mean_anomaly: String? = ""
)