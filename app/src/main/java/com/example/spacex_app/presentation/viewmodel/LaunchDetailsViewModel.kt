package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.Repository
import com.example.spacex_app.presentation.mapper.launchMapper.mapResponseToModel
import com.example.spacex_app.presentation.model.launchModel.LaunchModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject

class LaunchDetailsViewModel : BaseViewModel() {

    private val repository by inject<Repository>()

    val launchDetailsLiveData = MutableLiveData<LaunchModel>()

    fun getLaunchDetailsNetwork(launchId: String?) = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val launchDetailsResponse = repository.loadLaunchDetails(launchId!!)
            launchDetailsLiveData.postValue(mapResponseToModel(launchDetailsResponse))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }
}