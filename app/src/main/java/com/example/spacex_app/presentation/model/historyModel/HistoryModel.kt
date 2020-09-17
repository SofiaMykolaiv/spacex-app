package com.example.spacex_app.presentation.model.historyModel

import android.os.Parcelable
import com.example.spacex_app.presentation.model.launchModel.LinksModel
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HistoryModel(
    var id: Int? = 0,
    var title: String? = "",
    var eventDateUtc: String? = "",
    var eventDateUnix: Long? = 0L,
    var flightNumber: Int? = 0,
    var details: String? = "",
    var links: LinksModel? = LinksModel()
) : Parcelable