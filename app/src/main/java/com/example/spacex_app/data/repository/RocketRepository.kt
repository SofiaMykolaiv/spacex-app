package com.example.spacex_app.data.repository

import com.example.spacex_app.data.network.response.rocketResponse.RocketResponse
import com.example.spacex_app.data.network.retrofit.service.RocketService
import org.koin.core.inject

class RocketRepository : BaseRepository {

    private val rocketService by inject<RocketService>()

    suspend fun loadRocketList(): List<RocketResponse> {
        val rocketListResponse = rocketService.getRocketList()
        return rocketListResponse
    }
}