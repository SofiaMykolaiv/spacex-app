package com.example.spacex_app.presentation.mapper.launchMapper

import com.example.spacex_app.data.network.response.launchResponse.PayloadsResponse
import com.example.spacex_app.presentation.model.launchModel.PayloadsModel

fun mapResponseToModel(payloadsResponseList: List<PayloadsResponse>) =
    payloadsResponseList.map { payloadsResponse ->
        PayloadsModel(
            payloadId = payloadsResponse.payload_id,
            noradId = payloadsResponse.norad_id,
            reused = payloadsResponse.reused,
            customers = payloadsResponse.customers,
            nationality = payloadsResponse.nationality,
            manufacturer = payloadsResponse.manufacturer,
            payloadType = payloadsResponse.payload_type,
            payloadMassKg = payloadsResponse.payload_type,
            payloadMassLbs = payloadsResponse.payload_mass_lbs,
            orbit = payloadsResponse.orbit,
            orbitParams = mapResponseToModel(payloadsResponse.orbit_params!!)
        )
    }