package com.example.spacex_app.presentation.model.launchModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PayloadsModel(
    var payloadId: String? = "",
    var reused: Boolean? = false,
    var noradId: List<String>? = emptyList(),
    var customers: List<String>? = emptyList(),
    var nationality: String? = "",
    var manufacturer: String? = "",
    var payloadType: String? = "",
    var payloadMassKg: String? = "",
    var payloadMassLbs: String? = "",
    var orbit: String? = "",
    var orbitParams: OrbitParamsModel? = OrbitParamsModel()
) : Parcelable