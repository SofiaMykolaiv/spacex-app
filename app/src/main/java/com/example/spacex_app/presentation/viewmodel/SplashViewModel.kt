package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : BaseViewModel() {

    companion object {
        private const val DELAY = 2000L
    }

    val splashLiveData = MutableLiveData<Unit>()

    fun openHome() = CoroutineScope(Dispatchers.Main).launch {
        try {
            delay(DELAY)
            splashLiveData.value = Unit
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        }
    }
}