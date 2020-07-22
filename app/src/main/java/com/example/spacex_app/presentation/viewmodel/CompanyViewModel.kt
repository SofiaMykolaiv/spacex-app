package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.InfoRepository
import com.example.spacex_app.presentation.mapper.mapResponseToModel
import com.example.spacex_app.presentation.model.InfoModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject

class CompanyViewModel : BaseViewModel() {

    private val infoRepository by inject<InfoRepository>()

    val companyInfoLiveData = MutableLiveData<InfoModel>()

    fun getCompanyInfo() = CoroutineScope(Dispatchers.IO).launch {
        try {
            loadingLiveData.postValue(true)
            val infoResponse = infoRepository.loadInfo()
            companyInfoLiveData.postValue(mapResponseToModel(infoResponse))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        } finally {
            loadingLiveData.postValue(false)
        }
    }
}