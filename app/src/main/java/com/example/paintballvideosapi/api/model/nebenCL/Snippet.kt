package com.example.paintballvideosapi.api.model.nebenCL

import com.squareup.moshi.Json

data class Snippet (

    @Json(name = "publishedAt"          ) var publishedAt          : String?     = null,
    @Json(name = "channelId"            ) var channelId            : String?     = null,
    @Json(name = "title"                ) var title                : String?     = null,
    @Json(name = "description"          ) var description          : String?     = null,
    @Json(name = "thumbnails"           ) var thumbnails           : Thumbnails? = Thumbnails(),
    @Json(name = "channelTitle"         ) var channelTitle         : String?     = null,
    @Json(name = "liveBroadcastContent" ) var liveBroadcastContent : String?     = null,
    @Json(name = "publishTime"          ) var publishTime          : String?     = null

)