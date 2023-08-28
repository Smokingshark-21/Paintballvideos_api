package com.example.paintballvideosapi.api

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class VideoViewmodel:ViewModel() {

    val repository = Repository(api = Videoapi)

    val current = repository.video

    fun Videoinput(cityin:String){
        _search.postValue(cityin)
    }

    val _search : MutableLiveData<String> = MutableLiveData("")
    val search: LiveData<String>
        get() = _search
    fun loadVideo(search:String){
        viewModelScope.launch {
            repository.getVideo(search)
        }
    }
}