package com.example.spacex_app.presentation.mapper.infoMapper

import com.example.spacex_app.data.network.response.infoResponse.LinkResponse
import com.example.spacex_app.presentation.model.infoModel.LinkModel

fun mapResponseToModel(linkResponse: LinkResponse) =
    LinkModel(
        website = linkResponse.website,
        flickr = linkResponse.flickr,
        twitter = linkResponse.twitter,
        elonTwitter = linkResponse.elon_twitter
    )