package com.example.spacex_app.presentation.mapper.launchMapper

import com.example.spacex_app.data.network.response.launchResponse.LaunchSiteResponse
import com.example.spacex_app.presentation.model.launchModel.LaunchSiteModel

fun mapResponseToModel(launchSiteResponse: LaunchSiteResponse) = LaunchSiteModel(
    siteId = launchSiteResponse.site_id,
    siteName = launchSiteResponse.site_name,
    siteNameLong = launchSiteResponse.site_name_long
)