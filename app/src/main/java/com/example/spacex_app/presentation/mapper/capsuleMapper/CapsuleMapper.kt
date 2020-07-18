package com.example.spacex_app.presentation.mapper.capsuleMapper

import com.example.spacex_app.data.network.response.capsuleResponse.CapsuleResponse
import com.example.spacex_app.presentation.model.capsuleModel.CapsuleModel

fun mapResponseToModel(capsuleResponseList: List<CapsuleResponse>?) =
    capsuleResponseList?.let { list ->
        list.map { capsuleResponse ->
            CapsuleModel(
                capsuleSerial = capsuleResponse.capsule_serial,
                capsuleId = capsuleResponse.capsule_id,
                status = capsuleResponse.status,
                originalLaunch = capsuleResponse.original_launch,
                originalLaunchUnix = capsuleResponse.original_launch_unix,
                missions = mapResponseToModel(capsuleResponse.missions),
                landings = capsuleResponse.landings,
                type = capsuleResponse.type,
                details = capsuleResponse.details,
                reuseCount = capsuleResponse.reuse_count
            )
        }
    }