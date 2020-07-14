package com.example.spacex_app.data.network.response

data class RocketResponse(
    var rocket_id: String? = "",
    var rocket_name: String? = "",
    var rocket_type: String? = "",
    var first_stage: FirstStageResponse? = FirstStageResponse(),
    var second_stage: SecondStageResponse? = SecondStageResponse(),
    var fairings: FairingsResponse? = FairingsResponse()
)