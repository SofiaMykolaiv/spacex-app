package com.example.spacex_app.data.repository

import com.example.spacex_app.data.network.response.dragonResponse.DragonResponse
import com.example.spacex_app.data.network.retrofit.service.DragonService
import org.koin.core.inject

class DragonRepository : BaseRepository {

    private val dragonService by inject<DragonService>()

    suspend fun loadDragonList(): List<DragonResponse> {
        val dragonListResponse = dragonService.getDragonList()
        return dragonListResponse
    }
}