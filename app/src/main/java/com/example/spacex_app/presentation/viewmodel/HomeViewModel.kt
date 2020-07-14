package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.network.response.LaunchResponse
import com.example.spacex_app.data.repository.LaunchRepository
import com.example.spacex_app.presentation.mapper.mapResponseToModel
import com.example.spacex_app.presentation.model.LaunchModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject

class HomeViewModel : BaseViewModel() {

    private  val launchRepository by inject<LaunchRepository>()

    val launchLiveData = MutableLiveData<LaunchModel>()

    fun getNextLaunchNetwork() = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val nextLaunchResponse = launchRepository.loadNextLaunch()
            launchLiveData.postValue(mapResponseToModel(nextLaunchResponse))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }
}