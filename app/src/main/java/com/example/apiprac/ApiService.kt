package com.example.apiprac

import retrofit2.http.GET

interface ApiService {

    @GET("users")

    suspend fun getusers(): List<Model>


}