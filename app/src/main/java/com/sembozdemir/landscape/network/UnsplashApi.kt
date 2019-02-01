package com.sembozdemir.landscape.network

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

private const val ACCESS_KEY = "0c776459ed0e2eb4627e5424cfe75828de515c32853ac0619ef94b608eeddf3f"

interface UnsplashApi {

    @GET("/photos")
    fun getPhotos(
        @Query("page") page: Int = 0,
        @Query("per_page") perPage: Int = 30,
        @Query("order_by") orderBy: String = "latest",
        @Query("client_id") clientId: String = ACCESS_KEY
    ): Deferred<List<Photo>>
}