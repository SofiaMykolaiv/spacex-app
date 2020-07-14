package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.LaunchSiteResponse
import com.example.spacex_app.presentation.model.LaunchSiteModel

fun mapResponseToModel(launchSiteResponse: LaunchSiteResponse) = LaunchSiteModel(
    siteId = launchSiteResponse.site_id,
    siteName = launchSiteResponse.site_name,
    siteNameLong = launchSiteResponse.site_name_long
)