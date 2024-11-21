package com.aman.dogsapiapp.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Dog(
    @SerialName("message")
    val message: String = "",
    @SerialName("status")
    val status: String = ""
)