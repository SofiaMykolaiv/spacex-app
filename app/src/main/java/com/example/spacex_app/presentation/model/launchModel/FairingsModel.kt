package com.example.spacex_app.presentation.model.launchModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class FairingsModel(
    var reused: Boolean? = false,
    var recoveryAttempt: Boolean? = false,
    var recovered: String? = "",
    var ship: String? = ""
) : Parcelable