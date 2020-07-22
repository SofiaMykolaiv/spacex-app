package com.example.spacex_app.data.network.response.rocketResponse

import com.example.spacex_app.data.network.response.dragonResponse.DiameterResponse

data class CompositeFairingResponse (
    var height: HeightResponse? = HeightResponse(),
    var diameter: DiameterResponse? = DiameterResponse()
)