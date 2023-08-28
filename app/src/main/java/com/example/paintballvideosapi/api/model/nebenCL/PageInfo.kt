package com.example.paintballvideosapi.api.model.nebenCL

import com.squareup.moshi.Json

data class PageInfo(
    @Json(name = "totalResults"   ) var totalResults   : Int? = null,
    @Json(name = "resultsPerPage" ) var resultsPerPage : Int? = null
)
