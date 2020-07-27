package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TrunkModel(
    var trunkVolume: TrunkVolumeModel? = TrunkVolumeModel(),
    var cargo: CargoModel? = CargoModel()
) : Parcelable