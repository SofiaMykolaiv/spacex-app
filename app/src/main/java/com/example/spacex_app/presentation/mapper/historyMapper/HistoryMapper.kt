package com.example.spacex_app.presentation.mapper.historyMapper

import com.example.spacex_app.data.network.response.historyResponse.HistoryResponse
import com.example.spacex_app.presentation.model.historyModel.HistoryModel
import com.example.spacex_app.presentation.mapper.launchMapper.mapResponseToModel

fun mapResponseToModel(historyListResponse: List<HistoryResponse>?) =
    historyListResponse?.let { list ->
        list.map { historyResponse ->
            HistoryModel(
                id = historyResponse.id,
                title = historyResponse.title,
                eventDateUtc = historyResponse.event_date_utc,
                eventDateUnix = historyResponse.event_date_unix,
                flightNumber = historyResponse.flight_number,
                details = historyResponse.details,
                links = mapResponseToModel(historyResponse.links!!)
            )
        }
    }