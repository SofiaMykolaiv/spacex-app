package com.example.spacex_app.presentation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class FairingsModel(
    var reused: String? = "",
    var recoveryAttempt: String? = "",
    var recovered: String? = "",
    var ship: String? = ""
) : Parcelable