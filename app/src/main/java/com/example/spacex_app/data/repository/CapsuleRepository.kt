package com.example.spacex_app.data.repository

import com.example.spacex_app.data.network.response.capsuleResponse.CapsuleResponse
import com.example.spacex_app.data.network.retrofit.service.CapsuleService
import org.koin.core.inject

class CapsuleRepository : BaseRepository {

    private val capsuleService by inject<CapsuleService>()

    suspend fun loadCapsuleList(): List<CapsuleResponse> {
        val capsuleListResponse = capsuleService.getCapsulesList()
        return capsuleListResponse
    }

    suspend fun loadCapsuleUpcomingList(): List<CapsuleResponse> {
        val capsuleUpcomingListResponse = capsuleService.getUpcomingCapsulesList()
        return capsuleUpcomingListResponse
    }

    suspend fun loadPastCapsuleList(): List<CapsuleResponse> {
        val capsulePastListResponse = capsuleService.getPastCapsulesList()
        return capsulePastListResponse
    }
}