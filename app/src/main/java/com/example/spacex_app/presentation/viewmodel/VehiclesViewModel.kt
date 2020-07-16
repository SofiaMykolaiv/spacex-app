package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.DragonRepository
import com.example.spacex_app.presentation.mapper.mapResponseToModel
import com.example.spacex_app.presentation.model.dragonModel.DragonModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject

class VehiclesViewModel : BaseViewModel() {

    private val dragonRepository by inject<DragonRepository>()

    val dragonLiveData = MutableLiveData<List<DragonModel>>()

    fun getDragonListNetwork() = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val dragonListResponse = dragonRepository.loadDragonList()
            dragonLiveData.postValue(mapResponseToModel(dragonListResponse))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }
}