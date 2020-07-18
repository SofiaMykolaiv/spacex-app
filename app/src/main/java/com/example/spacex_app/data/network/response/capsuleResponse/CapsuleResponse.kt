package com.example.spacex_app.data.network.response.capsuleResponse

import com.example.spacex_app.data.network.response.shipResponse.MissionResponse

data class CapsuleResponse(
    var capsule_serial: String? = "",
    var capsule_id: String? = "",
    var status: String? = "",
    var original_launch: String? = "",
    var original_launch_unix: Long? = 0L,
    var missions: List<MissionResponse>? = emptyList(),
    var landings: Int? = 0,
    var type: String? = "",
    var details: String? = "",
    var reuse_count: Int? = 0
)