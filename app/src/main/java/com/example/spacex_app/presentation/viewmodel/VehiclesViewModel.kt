package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.Repository
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

    private val repository by inject<Repository>()

    val dragonLiveData = MutableLiveData<List<DragonModel>>()
    val shipLiveData = MutableLiveData<List<ShipModel>>()
    val rocketLiveData = MutableLiveData<List<RocketModel>>()

    fun getDragonListNetwork() = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val dragonListResponse = repository.loadDragonList()
            dragonLiveData.postValue(
                mapResponseToModel(dragonListResponse)
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
            val shipListResponse = repository.loadShipList()
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
            val rocketListResponse = repository.loadRocketList()
            rocketLiveData.postValue(mapResponseToModel(rocketListResponse))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }
}