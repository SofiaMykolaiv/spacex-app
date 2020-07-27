package com.example.spacex_app.presentation.mapper.shipMapper

import com.example.spacex_app.data.network.response.shipResponse.MissionResponse
import com.example.spacex_app.presentation.model.shipModel.MissionModel

fun mapResponseToModel(missionResponseList: List<MissionResponse>?) =
    missionResponseList?.let { list ->
        list.map { missionResponse ->
            MissionModel(
                name = missionResponse.name,
                flighr = missionResponse.flighr
            )
        }
    }
