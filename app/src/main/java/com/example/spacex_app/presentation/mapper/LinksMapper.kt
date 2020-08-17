package com.example.spacex_app.presentation.mapper

import com.example.spacex_app.data.network.response.LinksResponse
import com.example.spacex_app.presentation.model.LinksModel

fun mapResponseToModel(linksResponse: LinksResponse) = LinksModel(
    missionPatch = linksResponse.mission_patch,
    missionPatchSmall = linksResponse.mission_patch_small,
    redditCampaign = linksResponse.reddit_campaign,
    redditLaunch = linksResponse.reddit_launch,
    redditRecovery = linksResponse.reddit_recovery,
    redditMedia = linksResponse.reddit_media,
    presskit = linksResponse.presskit,
    articleLink = linksResponse.article_link,
    wikipedia = linksResponse.wikipedia,
    videoLink = linksResponse.video_link,
    youtubeId = linksResponse.youtube_id,
    flickrImages = linksResponse.flickr_images!!,
    reddit = linksResponse.reddit,
    article = linksResponse.article
)