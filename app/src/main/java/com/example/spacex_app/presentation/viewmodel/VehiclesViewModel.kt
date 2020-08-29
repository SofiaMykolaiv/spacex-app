package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.DragonRepository
import com.example.spacex_app.data.repository.RocketRepository
import com.example.spacex_app.data.repository.ShipRepository
import com.example.spacex_app.presentation.mapper.mapDragonResponseToModel
import com.example.spacex_app.presentation.mapper.mapRocketResponseToModel
import com.example.spacex_app.presentation.mapper.mapShipResponseToModel
import com.example.spacex_app.presentation.model.vehicleModel.VehicleModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import org.koin.core.inject

class VehiclesViewModel : BaseViewModel() {

    private val dragonRepository by inject<DragonRepository>()
    private val shipRepository by inject<ShipRepository>()
    private val rocketRepository by inject<RocketRepository>()

    private val dragonLiveData = MutableLiveData<List<VehicleModel>>()
    private val shipLiveData = MutableLiveData<List<VehicleModel>>()
    private val rocketLiveData = MutableLiveData<List<VehicleModel>>()

    val vehiclesMediatorLiveData = MediatorLiveData<List<VehicleModel>>()

    var count = COUNT_DEFAULT
    var vehicleList = ArrayList<VehicleModel>()

    companion object {
        private const val COUNT_DEFAULT = 0
        const val COUNT_ALL_SOURCES = 3
    }

    init {
        vehiclesMediatorLiveData.addSource(dragonLiveData) { value ->
            count++
            vehicleList.addAll(value)
            vehiclesMediatorLiveData.value = value
            hideProgress()
        }
        vehiclesMediatorLiveData.addSource(shipLiveData) { value ->
            count++
            vehicleList.addAll(value)
            vehiclesMediatorLiveData.value = value
            hideProgress()
        }
        vehiclesMediatorLiveData.addSource(rocketLiveData) { value ->
            count++
            vehicleList.addAll(value)
            vehiclesMediatorLiveData.value = value
            hideProgress()
        }
    }

    fun getVehicleAsyncData() = CoroutineScope(Dispatchers.Main).launch {
        loadingLiveData.value = true
        getDragonListNetwork()
        getShipListNetwork()
        getRocketListNetwork()
    }

    private fun hideProgress() {
        if (count == COUNT_ALL_SOURCES) {
            loadingLiveData.value = false
        }
    }

    private val dragonListAsync = CoroutineScope(Dispatchers.IO).async {
        val dragonListResponse = dragonRepository.loadDragonList()
        dragonLiveData.postValue(mapDragonResponseToModel(dragonListResponse))
    }

    private suspend fun getDragonListNetwork() {
        try {
            dragonListAsync.await()
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        }
    }

    private val shipListAsync = CoroutineScope(Dispatchers.IO).async {
        val shipListResponse = shipRepository.loadShipList()
        shipLiveData.postValue(mapShipResponseToModel(shipListResponse))
    }

    private suspend fun getShipListNetwork() {
        try {
            shipListAsync.await()
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        }
    }

    private val rocketListAsync = CoroutineScope(Dispatchers.IO).async {
        val rocketListResponse = rocketRepository.loadRocketList()
        rocketLiveData.postValue(mapRocketResponseToModel(rocketListResponse))
    }

    private suspend fun getRocketListNetwork() {
        try {
            rocketListAsync.await()
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        }
    }
}