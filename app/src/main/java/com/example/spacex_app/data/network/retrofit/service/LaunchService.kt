package com.example.spacex_app.data.network.retrofit.service

import com.example.spacex_app.data.network.response.LaunchResponse
import retrofit2.http.GET

interface LaunchService {

    @GET("/v3/launches")
    suspend fun loadLaunchList(): List<LaunchResponse>

    @GET("/v3/launches/next")
    suspend fun loadNextLaunch(): LaunchResponse
}