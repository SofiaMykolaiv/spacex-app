package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.Repository
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

    private val repository by inject<Repository>()

    private val dragonLiveData = MutableLiveData<List<VehicleModel>>()
    private val shipLiveData = MutableLiveData<List<VehicleModel>>()
    private val rocketLiveData = MutableLiveData<List<VehicleModel>>()

    private val vehiclesMediatorLiveData = MediatorLiveData<List<VehicleModel>>()
    val vehiclesLiveData: LiveData<List<VehicleModel>> = vehiclesMediatorLiveData

    private var count = COUNT_DEFAULT
    private val countMutableLiveData = MutableLiveData<Int>()
    val countLiveData: LiveData<Int> = countMutableLiveData

    companion object {
        private const val COUNT_DEFAULT = 0
        const val COUNT_ALL_SOURCES = 3
    }

    init {
        vehiclesMediatorLiveData.addSource(dragonLiveData) { value ->
            countMutableLiveData.value = ++count
            vehiclesMediatorLiveData.value = value
            hideProgress()
        }
        vehiclesMediatorLiveData.addSource(shipLiveData) { value ->
            countMutableLiveData.value = ++count
            vehiclesMediatorLiveData.value = value
            hideProgress()
        }
        vehiclesMediatorLiveData.addSource(rocketLiveData) { value ->
            countMutableLiveData.value = ++count
            vehiclesMediatorLiveData.value = value
            hideProgress()
        }
    }

    fun getVehicleAsyncData() = CoroutineScope(Dispatchers.Main).launch {
        //loadingLiveData.value = true
        getDragonListNetwork()
        getShipListNetwork()
        getRocketListNetwork()
    }

    private fun hideProgress() {
        if (countMutableLiveData.value == COUNT_ALL_SOURCES) {
            loadingLiveData.value = false
        }
    }

    private val dragonListAsync = CoroutineScope(Dispatchers.IO).async {
        val dragonListResponse = repository.loadDragonList()
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
        val shipListResponse = repository.loadShipList()
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
        val rocketListResponse = repository.loadRocketList()
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