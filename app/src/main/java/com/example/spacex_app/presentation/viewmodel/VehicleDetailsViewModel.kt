package com.example.spacex_app.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.spacex_app.data.repository.Repository
import com.example.spacex_app.presentation.mapper.mapVehicleEntityToModel
import com.example.spacex_app.presentation.model.vehicleModel.VehicleModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.inject

class VehicleDetailsViewModel : BaseViewModel() {

    private val repository by inject<Repository>()

    private val vehicleDetailsMutableLiveData = MutableLiveData<VehicleModel>()
    val vehicleDetailsLiveData: LiveData<VehicleModel> = vehicleDetailsMutableLiveData

    fun getVehicleDetails(vehicleId: String) = CoroutineScope(Dispatchers.IO).launch {
        try {
            val response = repository.getVehicleDetailsById(vehicleId)
            vehicleDetailsMutableLiveData.postValue(mapVehicleEntityToModel(response))
        } catch (e: Exception) {
            errorMessageLiveData.postValue(e.message)
        }
    }


}