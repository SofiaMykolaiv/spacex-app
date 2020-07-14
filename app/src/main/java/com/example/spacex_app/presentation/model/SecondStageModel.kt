package com.example.spacex_app.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SecondStageModel (
    var block:Int? = 0,
    var payloads: List<PayloadsModel>? = emptyList()
):Parcelable