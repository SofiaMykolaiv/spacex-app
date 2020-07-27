package com.example.spacex_app.data.repository

import com.example.spacex_app.data.network.response.infoResponse.InfoResponse
import com.example.spacex_app.data.network.service.InfoService
import org.koin.core.inject

class InfoRepository: BaseRepository {

    private val infoService by inject<InfoService>()

    suspend fun loadInfo(): InfoResponse {
        val infoResponse = infoService.getInfo()
        return infoResponse
    }
}