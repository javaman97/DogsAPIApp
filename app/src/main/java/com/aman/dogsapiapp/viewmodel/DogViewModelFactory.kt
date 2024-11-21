package com.aman.dogsapiapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aman.dogsapiapp.repository.DogRepository

class DogViewModelFactory(private val repository: DogRepository):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return  DogViewModel(repository) as T
    }
}