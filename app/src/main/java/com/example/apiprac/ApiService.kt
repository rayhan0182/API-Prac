package com.example.apiprac

import retrofit2.http.GET

interface ApiService {

    @GET

    fun getdata(): List<Model>


}