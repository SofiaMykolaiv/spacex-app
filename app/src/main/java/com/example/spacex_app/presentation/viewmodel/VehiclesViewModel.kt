package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.database.entity.VehicleEntity
import com.example.spacex_app.data.mapper.mapDragonResponseToEntity
import com.example.spacex_app.data.mapper.mapRocketResponseToEntity
import com.example.spacex_app.data.mapper.mapShipResponseToEntity
import com.example.spacex_app.data.repository.Repository
import com.example.spacex_app.presentation.mapper.mapVehicleEntityToModel
import com.example.spacex_app.presentation.model.vehicleModel.VehicleModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import org.koin.core.inject

class VehiclesViewModel : BaseViewModel() {

    private val repository by inject<Repository>()

    private val vehiclesMutableLiveData = MutableLiveData<List<VehicleModel>>()
    val vehiclesLiveData: LiveData<List<VehicleModel>> = vehiclesMutableLiveData

    private var count = COUNT_DEFAULT

    companion object {
        private const val COUNT_DEFAULT = 0
        private const val COUNT_ALL_SOURCES = 3
    }

    fun getVehicleAsyncData() = CoroutineScope(Dispatchers.Main).launch {
        getDragonListNetwork()
        getShipListNetwork()
        getRocketListNetwork()
    }

    fun getVehicleListDatabase() = CoroutineScope(Dispatchers.IO).launch {
        try {
            val vehicleListEntity = repository.loadVehicleListDatabase()
            if (vehicleListEntity.isNullOrEmpty()) {
                getVehicleAsyncData()
            } else {
                vehiclesMutableLiveData.postValue(mapVehicleEntityToModel(vehicleListEntity))
            }
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        }
    }

    private fun isAllRequestsDownloaded() {
        if (count == COUNT_ALL_SOURCES) {
            getVehicleListDatabase()
        }
    }

    private val dragonListAsync = CoroutineScope(Dispatchers.IO).async {
        val dragonListResponse = repository.loadDragonList()
        saveVehicleInDatabase(vehicleEntityList = mapDragonResponseToEntity(dragonListResponse))
        ++count
        isAllRequestsDownloaded()
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
        saveVehicleInDatabase(vehicleEntityList = mapShipResponseToEntity(shipListResponse))
        ++count
        isAllRequestsDownloaded()
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
        saveVehicleInDatabase(vehicleEntityList = mapRocketResponseToEntity(rocketListResponse))
        ++count
        isAllRequestsDownloaded()
    }

    private suspend fun getRocketListNetwork() {
        try {
            rocketListAsync.await()
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        }
    }

    private suspend fun saveVehicleInDatabase(vehicleEntityList: List<VehicleEntity>?) {
        try {
            repository.saveVehicleListDatabase(vehicleList = vehicleEntityList)
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        }
    }
}