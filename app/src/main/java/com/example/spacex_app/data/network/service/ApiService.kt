package com.example.spacex_app.data.network.service

import com.example.spacex_app.data.network.response.capsuleResponse.CapsuleResponse
import com.example.spacex_app.data.network.response.dragonResponse.DragonResponse
import com.example.spacex_app.data.network.response.infoResponse.InfoResponse
import com.example.spacex_app.data.network.response.launchResponse.LaunchResponse
import com.example.spacex_app.data.network.response.rocketResponse.RocketResponse
import com.example.spacex_app.data.network.response.shipResponse.ShipResponse
import retrofit2.http.GET

interface ApiService {

    @GET("/v3/capsules")
    suspend fun getCapsulesList(): List<CapsuleResponse>

    @GET("/v3/capsules/upcoming")
    suspend fun getUpcomingCapsulesList(): List<CapsuleResponse>

    @GET("/v3/capsules/past")
    suspend fun getPastCapsulesList(): List<CapsuleResponse>

    @GET("/v3/dragons")
    suspend fun getDragonList(): List<DragonResponse>

    @GET("/v3/info")
    suspend fun getInfo(): InfoResponse

    @GET("/v3/launches")
    suspend fun loadLaunchList(): List<LaunchResponse>

    @GET("/v3/launches/next")
    suspend fun loadNextLaunch(): LaunchResponse

    @GET("/v3/rockets")
    suspend fun getRocketList(): List<RocketResponse>

    @GET("/v3/ships")
    suspend fun getShipList(): List<ShipResponse>
}