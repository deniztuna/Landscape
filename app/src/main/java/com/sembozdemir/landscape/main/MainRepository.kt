package com.sembozdemir.landscape.main

import com.sembozdemir.landscape.network.Photo
import com.sembozdemir.landscape.network.UnsplashApi
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val unsplashApi: UnsplashApi
) {

    suspend fun getPhotos(): List<Photo> {
        return unsplashApi.getPhotos().await()
    }
}