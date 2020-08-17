package com.example.spacex_app.data.network.retrofit.service

import com.example.spacex_app.data.network.response.historyResponse.HistoryResponse
import retrofit2.http.GET

interface HistoryService {

    @GET("/v3/history")
    suspend fun getHistoryList(): List<HistoryResponse>
}