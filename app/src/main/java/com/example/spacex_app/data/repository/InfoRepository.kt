package com.example.spacex_app.data.repository

import com.example.spacex_app.data.network.response.historyResponse.HistoryResponse
import com.example.spacex_app.data.network.response.infoResponse.InfoResponse
import com.example.spacex_app.data.network.retrofit.service.HistoryService
import com.example.spacex_app.data.network.retrofit.service.InfoService
import org.koin.core.inject

class InfoRepository : BaseRepository {

    private val infoService by inject<InfoService>()
    private val historyService by inject<HistoryService>()

    suspend fun loadInfo(): InfoResponse {
        val infoResponse = infoService.getInfo()
        return infoResponse
    }

    suspend fun loadHistoryList(): List<HistoryResponse> {
        val historyListResponse = historyService.getHistoryList()
        return historyListResponse
    }
}