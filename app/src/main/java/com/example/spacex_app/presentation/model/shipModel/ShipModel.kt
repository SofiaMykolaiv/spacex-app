package com.example.spacex_app.presentation.model.shipModel

import android.os.Parcelable
import com.example.spacex_app.data.network.response.shipResponse.MissionResponse
import com.example.spacex_app.data.network.response.shipResponse.PositionResponse
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ShipModel (
    var shipId: String? = "",
    var shipName: String? = "",
    var shipModel: String? = "",
    var shipType: String? = "",
    var roles: List<String>? = arrayListOf(),
    var active: Boolean? = false,
    var imo: Long? = 0L,
    var mmsi: Long? = 0L,
    var abs: Long? = 0L,
    var weightLbs: Long? = 0L,
    var weightKg: Int? = 0,
    var yearBuilt: Int? = 0,
    var homePort: String? = "",
    var status: String? = "",
    var speedKn: String? = "",
    var courseDeg: String? = "",
    var position: PositionModel? = PositionModel(),
    var successfulLandings:String? = "",
    var attemptedLandings: String? = "",
    var missions: List<MissionModel>? = emptyList(),
    var url: String? = "",
    var image: String? = ""
): Parcelable