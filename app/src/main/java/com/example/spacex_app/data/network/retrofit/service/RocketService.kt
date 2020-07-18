package com.example.spacex_app.data.network.retrofit.service

import com.example.spacex_app.data.network.response.rocketResponse.RocketResponse
import retrofit2.http.GET

interface RocketService {

    @GET("/v3/rockets")
    suspend fun getRocketList(): List<RocketResponse>
}