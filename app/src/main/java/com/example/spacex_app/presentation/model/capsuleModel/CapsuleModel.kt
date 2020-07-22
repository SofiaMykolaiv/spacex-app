package com.example.spacex_app.presentation.model.capsuleModel

import android.os.Parcelable
import com.example.spacex_app.presentation.model.shipModel.MissionModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CapsuleModel(
    var capsuleSerial: String? = "",
    var capsuleId: String? = "",
    var status: String? = "",
    var originalLaunch: String? = "",
    var originalLaunchUnix: Long? = 0L,
    var missions: List<MissionModel>? = emptyList(),
    var landings: Int? = 0,
    var type: String? = "",
    var details: String? = "",
    var reuseCount: Int? = 0
) : Parcelable