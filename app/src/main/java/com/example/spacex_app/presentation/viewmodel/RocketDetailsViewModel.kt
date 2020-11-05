package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.Repository
import com.example.spacex_app.presentation.model.rocketModel.RocketModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject
import com.example.spacex_app.presentation.mapper.rocketMapper.mapResponseToModel

class RocketDetailsViewModel : BaseViewModel() {

    private val repository by inject<Repository>()

    val rocketDetailsLiveData = MutableLiveData<RocketModel>()

    fun getRocketDetailsNetwork(rocketId: String?) = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val rocketDetailsResponse = repository.loadRocketDetails(rocketId!!)
            rocketDetailsLiveData.postValue(mapResponseToModel(rocketDetailsResponse))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }
}