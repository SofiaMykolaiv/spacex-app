package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.Repository
import com.example.spacex_app.presentation.mapper.launchMapper.mapResponseToModel
import com.example.spacex_app.presentation.model.launchModel.LaunchModel
import com.example.spacex_app.utiles.DateUtils.formatToLocaleDate
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject

class HomeViewModel : BaseViewModel() {

    private val repository by inject<Repository>()

    val launchLiveData = MutableLiveData<LaunchModel>()

    fun getNextLaunchNetwork() = CoroutineScope(Dispatchers.Main).launch {
        try {
            loadingLiveData.value = true
            val nextLaunchResponse = repository.loadNextLaunch()
            launchLiveData.value = mapResponseToModel(nextLaunchResponse)
        } catch (e: Exception) {
            errorMessageLiveData.value = e.message
        } finally {
            loadingLiveData.value = false
        }
    }

    fun getLaunchDate(launchDateUtc: String?): String {
        val result = formatToLocaleDate(launchDateUtc)
        return result
    }

    fun getStaticFireDate(staticFireUtc: String?): String?{
        val result = formatToLocaleDate(staticFireUtc)
        return result
    }
}