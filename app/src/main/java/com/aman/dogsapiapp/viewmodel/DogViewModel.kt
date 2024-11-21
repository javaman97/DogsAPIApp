package com.aman.dogsapiapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aman.dogsapiapp.model.Dog
import com.aman.dogsapiapp.repository.DogRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class DogViewModel(private val repository: DogRepository): ViewModel() {
     val myResponse : MutableLiveData<Response<Dog>> = MutableLiveData()
     fun getRandomDogImage() {
         viewModelScope.launch{
            val response: Response<Dog> = repository.getRandomDogImage()
             if(response.isSuccessful){
                 myResponse.value = response
             } else{
                 Log.e("Response ", "Response Load Failed")
             }
         }
     }
}