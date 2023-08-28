package com.example.paintballvideosapi.api.model.LMH

import com.squareup.moshi.Json

data class High(
    @Json(name = "url"    ) var url    : String? = null,
    @Json(name = "width"  ) var width  : Int?    = null,
    @Json(name = "height" ) var height : Int?    = null
)
