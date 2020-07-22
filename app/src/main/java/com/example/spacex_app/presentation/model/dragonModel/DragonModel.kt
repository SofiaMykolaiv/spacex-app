package com.example.spacex_app.presentation.model.dragonModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DragonModel(
    var id: String? = "",
    var name: String? = "",
    var type: String? = "",
    var active: Boolean? = false,
    var crewCapacity: Int? = 0,
    var sidewallAngleDeg: Int? = 0,
    var orbitDurationYr: Int? = 0,
    var dryMassKg: Int? = 0,
    var dryMassLb: Int? = 0,
    var firstFlight: String? = "",
    var heatShield: HeatShieldModel? = HeatShieldModel(),
    var thrusters: List<ThrusterModel>? = emptyList(),
    var launchPayloadMass: LaunchPayloadMassModel? = LaunchPayloadMassModel(),
    var launchPayloadVol: LaunchPayloadVolModel? = LaunchPayloadVolModel(),
    var returnPayloadMass: ReturnPayloadMassModel? = ReturnPayloadMassModel(),
    var returnPayloadVol: ReturnPayloadVolModel? = ReturnPayloadVolModel(),
    var pressurizedCapsule: PressurizedCapsuleModel? = PressurizedCapsuleModel(),
    var trunk: TrunkModel? = TrunkModel(),
    var heightWTrunk: HeighWTrunkModel? = HeighWTrunkModel(),
    var diameter: DiameterModel? = DiameterModel(),
    var flickrImages: List<String>? = emptyList(),
    var wikipedia: String? = "",
    var description: String? = ""
) : Parcelable