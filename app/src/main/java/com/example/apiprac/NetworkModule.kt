package com.example.apiprac

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

  @Provides

  fun providebaseurl() = "https://jsonplaceholder.typicode.com/"






}