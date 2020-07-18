package com.example.spacex_app.presentation.model.rocketModel

import android.os.Parcelable
import com.example.spacex_app.presentation.model.dragonModel.DiameterModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RocketModel(
    var id: Int? = 0,
    var active: Boolean? = false,
    var stages: Int? = 0,
    var boosters: Int? = 0,
    var costPerLaunch: Long? = 0L,
    var successRatePct: Int? = 0,
    var firstFlight: String? = "",
    var country: String? = "",
    var company: String? = "",
    var height: HeightModel? = HeightModel(),
    var diameter: DiameterModel? = DiameterModel(),
    var mass: MassModel? = MassModel(),
    var payloadWeights: List<PayloadWeightsModel>? = emptyList(),
    var firstStage: FirstStageModel? = FirstStageModel(),
    var secondStage: SecondStageModel? = SecondStageModel(),
    var engines: EngineModel? = EngineModel(),
    var landingLegs: LandingLegModel? = LandingLegModel(),
    var flickrImages: List<String>? = emptyList(),
    var wikipedia: String? = "",
    var description: String? = "",
    var rocketId: String? = "",
    var rocketName: String? = "",
    var rocketType: String? = ""
) : Parcelable