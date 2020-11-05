package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.Repository
import com.example.spacex_app.presentation.mapper.dragonMapper.mapResponseToModel
import com.example.spacex_app.presentation.model.dragonModel.DragonModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject

class DragonDetailsViewModel : BaseViewModel() {

    private val repository by inject<Repository>()

    val dragonDetailsLiveData = MutableLiveData<DragonModel>()

    fun getDragonDetailsNetwork(dragonId: String?) = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val dragonDetailsResponse = repository.loadDragonDetails(dragonId!!)
            dragonDetailsLiveData.postValue(mapResponseToModel(dragonDetailsResponse))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }
}