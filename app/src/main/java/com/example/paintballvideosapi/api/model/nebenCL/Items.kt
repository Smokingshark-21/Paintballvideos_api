package com.example.paintballvideosapi.api.model.nebenCL

import com.squareup.moshi.Json

data class Items(
    @Json(name = "kind"    ) var kind    : String?  = null,
    @Json(name = "etag"    ) var etag    : String?  = null,
    @Json(name = "id"      ) var id      : Id?      = Id(),
    @Json(name = "snippet" ) var snippet : Snippet? = Snippet()

)
