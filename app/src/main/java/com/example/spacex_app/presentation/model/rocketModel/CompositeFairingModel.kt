package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import com.example.spacex_app.presentation.model.dragonModel.DiameterModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CompositeFairingModel(
    var height: HeightModel? = HeightModel(),
    var diameter: DiameterModel? = DiameterModel()
) : Parcelable