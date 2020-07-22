package com.example.spacex_app.data.network.retrofit.service

import com.example.spacex_app.data.network.response.capsuleResponse.CapsuleResponse
import retrofit2.http.GET

interface CapsuleService {

    @GET("/v3/capsules")
    suspend fun getCapsulesList(): List<CapsuleResponse>

    @GET("/v3/capsules/upcoming")
    suspend fun getUpcomingCapsulesList(): List<CapsuleResponse>

    @GET("/v3/capsules/past")
    suspend fun getPastCapsulesList(): List<CapsuleResponse>
}