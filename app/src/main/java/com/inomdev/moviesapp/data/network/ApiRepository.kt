package com.inomdev.moviesapp.data.network

import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiServices: ApiServices) {
    suspend fun getAllMovies()= apiServices.getAllMovies()
}