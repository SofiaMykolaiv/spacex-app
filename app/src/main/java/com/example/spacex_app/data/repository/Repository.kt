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
        val capsuleListResponse = apiService.loadCapsulesList()
        return capsuleListResponse
    }

    suspend fun loadCapsuleUpcomingList(): List<CapsuleResponse> {
        val capsuleUpcomingListResponse = apiService.loadUpcomingCapsulesList()
        return capsuleUpcomingListResponse
    }

    suspend fun loadPastCapsuleList(): List<CapsuleResponse> {
        val capsulePastListResponse = apiService.loadPastCapsulesList()
        return capsulePastListResponse
    }

    suspend fun loadDragonList(): List<DragonResponse> {
        val dragonListResponse = apiService.loadDragonList()
        return dragonListResponse
    }

    suspend fun loadDragonDetails(dragonId: String): DragonResponse {
        val dragonResponse = apiService.loadDragonsDetails(dragonId)
        return dragonResponse
    }

    suspend fun loadInfo(): InfoResponse {
        val infoResponse = apiService.loadInfo()
        return infoResponse
    }

    suspend fun loadHistoryList(): List<HistoryResponse> {
        val historyListResponse = apiService.loadHistoryList()
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

    suspend fun loadLatestLaunchList(): List<LaunchResponse> {
        val latestLaunchListResponse = apiService.loadPastLaunchList()
        return latestLaunchListResponse
    }

    suspend fun loadLaunchDetails(launchId: String): LaunchResponse {
        val launchResponse = apiService.loadLaunchDetails(launchId)
        return launchResponse
    }

    suspend fun loadShipList(): List<ShipResponse> {
        val shipListResponse = apiService.loadShipList()
        return shipListResponse
    }

    suspend fun loadShipDetails(shipId: String): ShipResponse {
        val shipResponse = apiService.loadShipDetails(shipId)
        return shipResponse
    }

    suspend fun loadRocketList(): List<RocketResponse> {
        val rocketListResponse = apiService.loadRocketList()
        return rocketListResponse
    }

    suspend fun loadRocketDetails(rocketId: String): RocketResponse {
        val rocketResponse = apiService.loadRocketDetails(rocketId)
        return rocketResponse
    }
}