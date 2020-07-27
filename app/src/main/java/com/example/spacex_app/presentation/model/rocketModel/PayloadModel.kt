package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PayloadModel(
    var option1: String? = "",
    var compositeFairing: CompositeFairingModel? = CompositeFairingModel()
) : Parcelable