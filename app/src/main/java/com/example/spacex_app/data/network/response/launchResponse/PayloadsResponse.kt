package com.example.spacex_app.data.network.response.launchResponse

data class PayloadsResponse(
    var payload_id: String? = "",
    var norad_id: List<String>? = emptyList(),
    var reused: Boolean? = false,
    var customers: List<String>? = emptyList(),
    var nationality: String? = "",
    var manufacturer: String? = "",
    var payload_type: String? = "",
    var payload_mass_kg: String? = "",
    var payload_mass_lbs: String? = "",
    var orbit: String? = "",
    var orbit_params: OrbitParamsResponse? = OrbitParamsResponse()
)