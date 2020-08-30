package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.LaunchRepository
import com.example.spacex_app.presentation.mapper.launchMapper.mapResponseToModel
import com.example.spacex_app.presentation.model.launchModel.LaunchModel
import com.example.spacex_app.utiles.formatToLocaleDate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject

class HomeViewModel : BaseViewModel() {

    private val launchRepository by inject<LaunchRepository>()

    val launchLiveData = MutableLiveData<LaunchModel>()

    fun getNextLaunchNetwork() = CoroutineScope(Dispatchers.Main).launch {
        try {
            loadingLiveData.value = true
            val nextLaunchResponse = launchRepository.loadNextLaunch()
            launchLiveData.value = mapResponseToModel(nextLaunchResponse)
        } catch (e: Exception) {
            errorMessageLiveData.value = e.message
        } finally {
            loadingLiveData.value = false
        }
    }

    fun getLaunchDate(launchDateUtc: String?): String {
        var result = ""
        try {
            result = formatToLocaleDate(launchDateUtc)
        } catch (e: Exception) {
            errorMessageLiveData.value = e.message
        }
        return result
    }

    fun getStaticFireDate(staticFireUtc: String?): String?{
        var result = ""
        try {
            result = formatToLocaleDate(staticFireUtc)
        } catch (e: Exception) {
            errorMessageLiveData.value = e.message
        }
        return result
    }
}