package com.example.spacex_app.data.network.service

import com.example.spacex_app.data.network.response.capsuleResponse.CapsuleResponse
import com.example.spacex_app.data.network.response.dragonResponse.DragonResponse
import com.example.spacex_app.data.network.response.historyResponse.HistoryResponse
import com.example.spacex_app.data.network.response.infoResponse.InfoResponse
import com.example.spacex_app.data.network.response.launchResponse.LaunchResponse
import com.example.spacex_app.data.network.response.rocketResponse.RocketResponse
import com.example.spacex_app.data.network.response.shipResponse.ShipResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/v3/capsules")
    suspend fun loadCapsulesList(): List<CapsuleResponse>

    @GET("/v3/capsules/upcoming")
    suspend fun loadUpcomingCapsulesList(): List<CapsuleResponse>

    @GET("/v3/capsules/past")
    suspend fun loadPastCapsulesList(): List<CapsuleResponse>

    @GET("/v3/dragons")
    suspend fun loadDragonList(): List<DragonResponse>

    @GET("/v3/dragons")
    suspend fun loadDragonsDetails(@Query("dragon_id")dragonId: String): DragonResponse

    @GET("/v3/info")
    suspend fun loadInfo(): InfoResponse

    @GET("/v3/history")
    suspend fun loadHistoryList(): List<HistoryResponse>

    @GET("/v3/launches")
    suspend fun loadLaunchList(): List<LaunchResponse>

    @GET("/v3/launches/next")
    suspend fun loadNextLaunch(): LaunchResponse

    @GET("/v3/launches/upcoming")
    suspend fun loadUpcomingLaunchList(): List<LaunchResponse>

    @GET("/v3/launches/past")
    suspend fun loadPastLaunchList(): List<LaunchResponse>

    @GET("/v3/launches")
    suspend fun loadLaunchDetails(@Query("launch_id") launchId: String): LaunchResponse

    @GET("/v3/ships")
    suspend fun loadShipList(): List<ShipResponse>

    @GET("/v3/ships")
    suspend fun loadShipDetails(@Query("ship_id") shipId: String): ShipResponse

    @GET("/v3/rockets")
    suspend fun loadRocketList(): List<RocketResponse>

    @GET("/v3/rockets")
    suspend fun loadRocketDetails(@Query("rocket_id") rocketId: String): RocketResponse
}