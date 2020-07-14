package com.example.spacex_app.data.network.response

data class LinksResponse(
    var mission_patch: String? = "",
    var mission_patch_small: String? = "",
    var reddit_campaign: String? = "",
    var reddit_launch: String? = "",
    var reddit_recovery: String? = "",
    var reddit_media: String? = "",
    var presskit: String? = "",
    var article_link: String? = "",
    var wikipedia: String? = "",
    var video_link: String? = "",
    var youtube_id: String? = "",
    var flickr_images: List<String>? = emptyList()
)