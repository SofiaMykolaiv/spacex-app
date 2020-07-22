package com.example.spacex_app.presentation.mapper.rocketMapper

import com.example.spacex_app.data.network.response.rocketResponse.PayloadWeightsResponse
import com.example.spacex_app.presentation.model.rocketModel.PayloadWeightsModel

fun mapResponseToModel(payloadWeightsListResponse: List<PayloadWeightsResponse>?) =
    payloadWeightsListResponse?.let { list ->
        list.map { payloadWeightsResponse ->
            PayloadWeightsModel(
                id = payloadWeightsResponse.id,
                name = payloadWeightsResponse.name,
                kg = payloadWeightsResponse.kg,
                lb = payloadWeightsResponse.lb

            )
        }
    }