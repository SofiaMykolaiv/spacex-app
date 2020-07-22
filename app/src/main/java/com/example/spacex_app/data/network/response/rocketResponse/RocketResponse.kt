package com.example.spacex_app.data.network.response.rocketResponse

import com.example.spacex_app.data.network.response.dragonResponse.DiameterResponse

data class RocketResponse(
    var id: Int? = 0,
    var active: Boolean? = false,
    var stages: Int? = 0,
    var boosters: Int? = 0,
    var cost_per_launch: Long? = 0L,
    var success_rate_pct: Int? = 0,
    var first_flight: String? = "",
    var country: String? = "",
    var company: String? = "",
    var height: HeightResponse? = HeightResponse(),
    var diameter: DiameterResponse? = DiameterResponse(),
    var mass: MassResponse? = MassResponse(),
    var payload_weights: List<PayloadWeightsResponse>? = emptyList(),
    var first_stage: FirstStageResponse? = FirstStageResponse(),
    var second_stage: SecondStageResponse? = SecondStageResponse(),
    var engines: EngineResponse? = EngineResponse(),
    var landing_legs: LandingLegResponse? = LandingLegResponse(),
    var flickr_images: List<String>? = emptyList(),
    var wikipedia: String? = "",
    var description: String? = "",
    var rocket_id: String? = "",
    var rocket_name: String? = "",
    var rocket_type: String? = ""
)