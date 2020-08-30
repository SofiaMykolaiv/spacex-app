package com.example.spacex_app.presentation.model.launchModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FirstStageModel (
    var cores: List<CoreModel>? = emptyList()
): Parcelable