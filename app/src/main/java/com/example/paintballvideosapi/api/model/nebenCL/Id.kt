package com.example.paintballvideosapi.api.model.nebenCL

import com.squareup.moshi.Json

data class Id(
    @Json(name = "kind"    ) var kind    : String? = null,
    @Json(name = "videoId" ) var videoId : String? = null
)
