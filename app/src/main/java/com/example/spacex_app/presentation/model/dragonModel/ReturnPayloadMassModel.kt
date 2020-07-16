package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ReturnPayloadMassModel(
    var kg: Int? = 0,
    var lb: Int? = 0
) : Parcelable