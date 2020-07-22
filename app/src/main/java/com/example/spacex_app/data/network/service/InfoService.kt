package com.example.spacex_app.data.network.service

import com.example.spacex_app.data.network.response.InfoResponse
import retrofit2.http.GET

interface InfoService {

    @GET("/v3/info")
    suspend fun getInfo(): InfoResponse
}