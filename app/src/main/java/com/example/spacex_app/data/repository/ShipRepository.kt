package com.example.spacex_app.data.repository

import com.example.spacex_app.data.network.response.shipResponse.ShipResponse
import com.example.spacex_app.data.network.retrofit.service.ShipService
import org.koin.core.inject

class ShipRepository : BaseRepository {

    private val shipService by inject<ShipService>()

    suspend fun loadShipList(): List<ShipResponse> {
        val shipListResponse = shipService.getShipList()
        return shipListResponse
    }
}