package com.example.paintballvideosapi.api.model.LMH

import com.squareup.moshi.Json

data class Default (
    @Json(name = "url"    ) var url    : String? = null,
    @Json(name = "width"  ) var width  : Int?    = null,
    @Json(name = "height" ) var height : Int?    = null
)