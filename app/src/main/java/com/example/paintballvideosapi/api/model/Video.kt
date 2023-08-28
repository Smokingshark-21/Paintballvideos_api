package com.example.paintballvideosapi.api.model

import com.example.paintballvideosapi.api.model.nebenCL.Items
import com.example.paintballvideosapi.api.model.nebenCL.PageInfo
import com.squareup.moshi.Json

data class Video (
    @Json(name = "kind"          ) var kind          : String?          = null,
    @Json(name = "etag"          ) var etag          : String?          = null,
    @Json(name = "nextPageToken" ) var nextPageToken : String?          = null,
    @Json(name = "regionCode"    ) var regionCode    : String?          = null,
    @Json(name = "pageInfo"      ) var pageInfo      : PageInfo?        = PageInfo(),
    @Json(name = "items"         ) var items         : List<Items>
)