package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.DragonRepository
import com.example.spacex_app.data.repository.RocketRepository
import com.example.spacex_app.data.repository.ShipRepository
import com.example.spacex_app.presentation.mapper.dragonMapper.mapResponseToModel
import com.example.spacex_app.presentation.mapper.rocketMapper.mapResponseToModel
import com.example.spacex_app.presentation.mapper.shipMapper.mapResponseToModel
import com.example.spacex_app.presentation.model.dragonModel.DragonModel
import com.example.spacex_app.presentation.model.rocketModel.RocketModel
import com.example.spacex_app.presentation.model.shipModel.ShipModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject

class VehiclesViewModel : BaseViewModel() {

    private val dragonRepository by inject<DragonRepository>()
    private val shipRepository by inject<ShipRepository>()
    private val rocketRepository by inject<RocketRepository>()

    val dragonLiveData = MutableLiveData<List<DragonModel>>()
    val shipLiveData = MutableLiveData<List<ShipModel>>()
    val rocketLiveData = MutableLiveData<List<RocketModel>>()

    fun getDragonListNetwork() = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val dragonListResponse = dragonRepository.loadDragonList()
            dragonLiveData.postValue(mapResponseToModel(dragonListResponse)
            )
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }

    fun getShipListNetwork() = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val shipListResponse = shipRepository.loadShipList()
            shipLiveData.postValue(mapResponseToModel(shipListResponse))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }

    fun getRocketListNetwork() = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val rocketListResponse = rocketRepository.loadRocketList()
            rocketLiveData.postValue(mapResponseToModel(rocketListResponse))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }
}