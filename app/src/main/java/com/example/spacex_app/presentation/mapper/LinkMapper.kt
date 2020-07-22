package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.LinkResponse
import com.example.spacex_app.presentation.model.LinkModel

fun mapResponseToModel(linkResponse: LinkResponse) = LinkModel(
    website = linkResponse.website,
    flickr = linkResponse.flickr,
    twitter = linkResponse.twitter,
    elonTwitter = linkResponse.elon_twitter
)