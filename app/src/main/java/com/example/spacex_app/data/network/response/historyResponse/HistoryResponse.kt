package com.example.spacex_app.data.network.response.historyResponse

import com.example.spacex_app.data.network.response.LinksResponse

data class HistoryResponse(
    var id: Int? = 0,
    var title: String? = "",
    var event_date_utc: String? = "",
    var event_date_unix: Long? = 0L,
    var flight_number: Int? = 0,
    var details: String? = "",
    var links: LinksResponse? = LinksResponse()
)