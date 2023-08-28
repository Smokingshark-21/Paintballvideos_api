package com.example.paintballvideosapi.api

import android.content.ContentValues
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.paintballvideosapi.api.model.Video

class Repository(private val api :Videoapi) {

    private val _video = MutableLiveData<Video>()
    val video: LiveData<Video>
        get() = _video

    suspend fun getVideo(search:String){
        try {
            _video.value=api.retrofitService.getData(search)
            Log.wtf("test","${_video.value}")
        }catch (e:Exception){
            Log.e(ContentValues.TAG,"Error $e")
        }
    }
}