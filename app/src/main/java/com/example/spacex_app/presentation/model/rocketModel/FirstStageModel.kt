package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import com.example.spacex_app.presentation.model.rocketModel.ThrustSeaLevelModel
import com.example.spacex_app.presentation.model.rocketModel.ThrustVacuumModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FirstStageModel (
    var reusable: Boolean? = false,
    var engines: Int? = 0,
    var fuelAmountTons: Double? = 0.00,
    var burnTimeSec: Int? = 0,
    var thrustSeaLevel: ThrustSeaLevelModel? = ThrustSeaLevelModel(),
    var thrustVacuum: ThrustVacuumModel? = ThrustVacuumModel()
): Parcelable