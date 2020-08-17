package com.example.spacex_app.data.network.retrofit.service

import com.example.spacex_app.data.network.response.infoResponse.InfoResponse
import retrofit2.http.GET

interface InfoService {

    @GET("/v3/info")
    suspend fun getInfo(): InfoResponse
}