package com.example.apiprac

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class viewmodel @Inject constructor(private val repository: Repository) : ViewModel() {


     private val _userdata  = MutableLiveData<List<Model>>()

     val userdata : LiveData<List<Model>> = _userdata

    fun fetchdata() {

       viewModelScope.launch {

           try {

               _userdata.value = repository.createdata()

           }catch (e: Exception) {

               Log.d("API error",e.toString())
           }



       }



    }



    }





