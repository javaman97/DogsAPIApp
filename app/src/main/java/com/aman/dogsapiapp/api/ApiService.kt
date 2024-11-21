package com.aman.dogsapiapp.api

import com.aman.dogsapiapp.model.Dog
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("api/breeds/image/random")
    suspend fun getRandomDogImage(): Response<Dog>

}