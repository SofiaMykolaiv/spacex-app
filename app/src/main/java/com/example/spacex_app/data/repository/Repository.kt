package com.example.spacex_app.data.repository

import com.example.spacex_app.data.network.response.capsuleResponse.CapsuleResponse
import com.example.spacex_app.data.network.response.dragonResponse.DragonResponse
import com.example.spacex_app.data.network.response.historyResponse.HistoryResponse
import com.example.spacex_app.data.network.response.infoResponse.InfoResponse
import com.example.spacex_app.data.network.response.launchResponse.LaunchResponse
import com.example.spacex_app.data.network.response.rocketResponse.RocketResponse
import com.example.spacex_app.data.network.response.shipResponse.ShipResponse
import com.example.spacex_app.data.network.service.ApiService
import org.koin.core.inject

class Repository : BaseRepository {

    private val apiService by inject<ApiService>()

    suspend fun loadCapsuleList(): List<CapsuleResponse> {
        val capsuleListResponse = apiService.getCapsulesList()
        return capsuleListResponse
    }

    suspend fun loadCapsuleUpcomingList(): List<CapsuleResponse> {
        val capsuleUpcomingListResponse = apiService.getUpcomingCapsulesList()
        return capsuleUpcomingListResponse
    }

    suspend fun loadPastCapsuleList(): List<CapsuleResponse> {
        val capsulePastListResponse = apiService.getPastCapsulesList()
        return capsulePastListResponse
    }

    suspend fun loadDragonList(): List<DragonResponse> {
        val dragonListResponse = apiService.getDragonList()
        return dragonListResponse
    }

    suspend fun loadInfo(): InfoResponse {
        val infoResponse = apiService.getInfo()
        return infoResponse
    }

    suspend fun loadHistoryList(): List<HistoryResponse> {
        val historyListResponse = apiService.getHistoryList()
        return historyListResponse
    }

    suspend fun loadLaunchList(): List<LaunchResponse> {
        val launchListResponse = apiService.loadLaunchList()
        return launchListResponse
    }

    suspend fun loadNextLaunch(): LaunchResponse {
        val launchResponse = apiService.loadNextLaunch()
        return launchResponse
    }

    suspend fun loadUpcomingLaunchList(): List<LaunchResponse> {
        val upcomingLaunchListResponse = apiService.loadUpcomingLaunchList()
        return upcomingLaunchListResponse
    }

    suspend fun loadLatestLaunchList(): List<LaunchResponse>{
        val latestLaunchListResponse = apiService.loadPastLaunchList()
        return latestLaunchListResponse
    }

    suspend fun loadRocketList(): List<RocketResponse> {
        val rocketListResponse = apiService.getRocketList()
        return rocketListResponse
    }

    suspend fun loadShipList(): List<ShipResponse> {
        val shipListResponse = apiService.getShipList()
        return shipListResponse
    }
}