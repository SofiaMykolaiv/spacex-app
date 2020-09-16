package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.Repository
import com.example.spacex_app.presentation.mapper.infoMapper.mapResponseToModel
import com.example.spacex_app.presentation.model.historyModel.HistoryModel
import com.example.spacex_app.presentation.model.infoModel.InfoModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import org.koin.core.inject

class CompanyViewModel : BaseViewModel() {

    private val infoRepository by inject<Repository>()

    val companyInfoLiveData = MutableLiveData<InfoModel>()
    val historyLiveData = MutableLiveData<List<HistoryModel>>()

    fun getCompanyAsyncData() = CoroutineScope(Dispatchers.IO).launch {
        getCompanyInfoAsync()
        getHistoryListAsync()
    }

    private val companyInfoAsync = CoroutineScope(Dispatchers.IO).async {
        val infoResponse = infoRepository.loadInfo()
        companyInfoLiveData.postValue(mapResponseToModel(infoResponse))
    }

    private suspend fun getCompanyInfoAsync() {
        try {
            companyInfoAsync.await()
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        }
    }

    private val historyListAsync = CoroutineScope(Dispatchers.IO).async {
        val historyListResponse = infoRepository.loadHistoryList()
        historyLiveData.postValue(
            com.example.spacex_app.presentation.mapper.historyMapper.mapResponseToModel(
                historyListResponse
            )
        )
    }

    private suspend fun getHistoryListAsync() {
        try {
            historyListAsync.await()
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        }
    }
}