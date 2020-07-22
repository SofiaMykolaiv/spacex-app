package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PressurizedCapsuleModel(
    var payloadVolume: PayloadVolumeModel? = PayloadVolumeModel()
) : Parcelable