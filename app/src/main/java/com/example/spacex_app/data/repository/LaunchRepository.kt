package com.example.spacex_app.data.repository

import com.example.spacex_app.data.network.response.launchResponse.LaunchResponse
import com.example.spacex_app.data.network.retrofit.service.LaunchService
import org.koin.core.inject

class LaunchRepository : BaseRepository {

    private val launchService by inject<LaunchService>()

    suspend fun loadLaunchList(): List<LaunchResponse>{
        val launchListResponse = launchService.loadLaunchList()
        return launchListResponse
    }

    suspend fun loadNextLaunch(): LaunchResponse {
        val launchResponse = launchService.loadNextLaunch()
        return launchResponse
    }
}