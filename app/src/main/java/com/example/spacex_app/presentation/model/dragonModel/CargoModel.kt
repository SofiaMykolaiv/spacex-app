package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CargoModel(
    var solarArray: Int? = 0,
    var unpressurizedCargo: Boolean? = false
) : Parcelable