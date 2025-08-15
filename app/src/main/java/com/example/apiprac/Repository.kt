package com.example.apiprac

import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) {

    suspend fun createdata(): List<Model> = apiService.getdata()


}