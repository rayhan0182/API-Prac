package com.example.apiprac

import androidx.annotation.IntDef
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkInstance {

    @Provides

    @Singleton

    fun apiurl() = "https://jsonplaceholder.typicode.com/users"

    @Provides

    @Singleton

    fun callapi(BASE_Url: String): Retrofit = Retrofit

        .Builder()

        .baseUrl(BASE_Url)

        .build()

    @Provides

    @Singleton

    fun apiservice(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)










}