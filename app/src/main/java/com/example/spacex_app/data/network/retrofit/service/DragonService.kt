package com.example.spacex_app.data.network.retrofit.service

import com.example.spacex_app.data.network.response.dragonResponse.DragonResponse
import retrofit2.http.GET

interface DragonService {

    @GET("/v3/dragons")
    suspend fun getDragonList(): List<DragonResponse>
}