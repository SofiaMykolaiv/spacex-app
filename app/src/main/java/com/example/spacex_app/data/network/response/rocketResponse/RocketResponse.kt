package com.example.spacex_app.data.network.response.rocketResponse

import com.example.spacex_app.data.network.response.dragonResponse.DiameterResponse
import com.google.gson.annotations.SerializedName

data class RocketResponse(
    @SerializedName(value = "id") var id: Int = 0,
    @SerializedName(value = "active") var active: Boolean? = false,
    @SerializedName(value = "stages") var stages: Int? = 0,
    @SerializedName(value = "boosters") var boosters: Int? = 0,
    @SerializedName(value = "cost_per_launch") var cost_per_launch: Long? = 0L,
    @SerializedName(value = "success_rate_pct") var success_rate_pct: Int? = 0,
    @SerializedName(value = "first_flight") var first_flight: String? = "",
    @SerializedName(value = "country") var country: String? = "",
    @SerializedName(value = "company") var company: String? = "",
    @SerializedName(value = "height") var height: HeightResponse? = HeightResponse(),
    @SerializedName(value = "diameter") var diameter: DiameterResponse? = DiameterResponse(),
    @SerializedName(value = "mass") var mass: MassResponse? = MassResponse(),
    @SerializedName(value = "payload_weights") var payload_weights: List<PayloadWeightsResponse>? = emptyList(),
    @SerializedName(value = "first_stage") var first_stage: FirstStageResponse? = FirstStageResponse(),
    @SerializedName(value = "second_stage") var second_stage: SecondStageResponse? = SecondStageResponse(),
    @SerializedName(value = "engines") var engines: EngineResponse? = EngineResponse(),
    @SerializedName(value = "landing_legs") var landing_legs: LandingLegResponse? = LandingLegResponse(),
    @SerializedName(value = "flickr_images") var flickr_images: List<String>? = emptyList(),
    @SerializedName(value = "wikipedia") var wikipedia: String? = "",
    @SerializedName(value = "description") var description: String? = "",
    @SerializedName(value = "rocket_id") var rocket_id: String = "",
    @SerializedName(value = "rocket_name") var rocket_name: String? = "",
    @SerializedName(value = "rocket_type") var rocket_type: String? = ""
)