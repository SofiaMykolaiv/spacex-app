package com.example.spacex_app.presentation.model.launchModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RocketModel(
    var rocketId: String? = "",
    var rocketName: String? = "",
    var rocketType: String? = "",
    var firstStage: FirstStageModel? = FirstStageModel(),
    var secondStage: SecondStageModel? = SecondStageModel(),
    var fairings: FairingsModel? = FairingsModel()
) : Parcelable