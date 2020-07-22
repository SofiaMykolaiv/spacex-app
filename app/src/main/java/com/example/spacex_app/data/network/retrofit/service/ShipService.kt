package com.example.spacex_app.data.network.retrofit.service

import com.example.spacex_app.data.network.response.shipResponse.ShipResponse
import retrofit2.http.GET

interface ShipService {

    @GET("/v3/ships")
    suspend fun getShipList(): List<ShipResponse>
}