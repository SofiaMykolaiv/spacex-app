package com.example.spacex_app.presentation.mapper.dragonMapper

import com.example.spacex_app.data.network.response.dragonResponse.ReturnPayloadMassResponse
import com.example.spacex_app.presentation.model.dragonModel.ReturnPayloadMassModel

fun mapResponseToModel(returnPayloadMassResponse: ReturnPayloadMassResponse) = ReturnPayloadMassModel(
    kg = returnPayloadMassResponse.kg,
    lb = returnPayloadMassResponse.lb
)