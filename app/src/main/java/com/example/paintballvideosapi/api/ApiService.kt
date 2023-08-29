package com.example.paintballvideosapi.api

import com.example.paintballvideosapi.api.model.Video
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


const val BASE_URL = "https://www.googleapis.com/youtube/v3/"

const val TOKEN = "example"

val client:OkHttpClient = OkHttpClient.Builder().addInterceptor{ chain ->
    val newRequest: Request = chain.request().newBuilder()
        .addHeader("Authorization","Bearer $TOKEN")
        .build()
    chain.proceed(newRequest)
}.build()

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()


private val retrofit = Retrofit.Builder()
    .client(client)
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface VideoApiService {
    @GET("search?part=snippet&eventType=live&maxResults=25&type=video&key=[example]&")
    suspend fun getData(
        @Query("q") search: String
    ): Video
}

object Videoapi {
    val retrofitService: VideoApiService by lazy { retrofit.create(VideoApiService::class.java) }
}