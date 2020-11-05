package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.Repository
import com.example.spacex_app.presentation.mapper.shipMapper.mapResponseToModel
import com.example.spacex_app.presentation.model.shipModel.ShipModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject

class ShipDetailsViewModel : BaseViewModel() {

    private val repository by inject<Repository>()

    val shipDetailsLiveData = MutableLiveData<ShipModel>()

    fun getShipDetailsNetwork(shipId: String?) = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val shipDetailsResponse = repository.loadShipDetails(shipId!!)
            shipDetailsLiveData.postValue(mapResponseToModel(shipDetailsResponse))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }
}