package com.aman.dogsapiapp.repository

import com.aman.dogsapiapp.api.RetrofitInstance
import com.aman.dogsapiapp.model.Dog
import retrofit2.Response

class DogRepository {

    suspend fun getRandomDogImage():Response<Dog> {
        return RetrofitInstance.api.getRandomDogImage()
    }

}