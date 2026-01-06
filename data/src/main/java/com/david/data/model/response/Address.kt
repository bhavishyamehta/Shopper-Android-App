package com.david.data.model.response

data class Address(
    val addressLine: String,
    val city: String,
    val country: String,
    val postalCode: String,
    val state: String
)