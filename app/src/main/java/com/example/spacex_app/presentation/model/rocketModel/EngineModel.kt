package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class EngineModel(
    var number: Int? = 0,
    var type: String? = "",
    var version: String? = "",
    var layout: String? = "",
    var isp: IspModel? = IspModel(),
    var engineLossMax: Int? = 0,
    var propellant1: String? = "",
    var propellant2: String? = "",
    var thrustSeaLevel: ThrustSeaLevelModel? = ThrustSeaLevelModel(),
    var thrustVacuum: ThrustVacuumModel? = ThrustVacuumModel(),
    var thrustToWeight: Double? = 0.0
) : Parcelable