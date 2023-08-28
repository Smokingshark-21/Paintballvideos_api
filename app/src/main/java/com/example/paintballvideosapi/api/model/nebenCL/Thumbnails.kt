package com.example.paintballvideosapi.api.model.nebenCL

import com.example.paintballvideosapi.api.model.LMH.Default
import com.example.paintballvideosapi.api.model.LMH.High
import com.example.paintballvideosapi.api.model.LMH.Medium
import com.squareup.moshi.Json

data class Thumbnails(
    @Json(name = "default" ) var default : Default? = Default(),
    @Json(name = "medium"  ) var medium  : Medium?  = Medium(),
    @Json(name = "high"    ) var high    : High?    = High())
