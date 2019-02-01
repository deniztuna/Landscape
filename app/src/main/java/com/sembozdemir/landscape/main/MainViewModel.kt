package com.sembozdemir.landscape.main

import androidx.lifecycle.MutableLiveData
import com.sembozdemir.landscape.core.base.BaseViewModel
import com.sembozdemir.landscape.hello.HelloProvider
import com.sembozdemir.landscape.network.Photo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val helloProvider: HelloProvider,
    private val mainRepository: MainRepository
) : BaseViewModel() {

    val helloText: MutableLiveData<String> = MutableLiveData<String>().apply { value = "" }

    val photos: MutableLiveData<List<Photo>> = MutableLiveData()

    fun onSayHelloButtonClick() {
        helloText.postValue(helloProvider.sayHello())
    }

    fun onPhotosNeeded() {
        launch {
            val photoList = mainRepository.getPhotos()
            withContext(Dispatchers.Main) {
                photos.postValue(photoList)
            }
        }
    }

}