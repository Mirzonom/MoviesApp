package com.inomdev.moviesapp.data.network

import com.inomdev.moviesapp.data.models.Movies
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {
    @GET("/shows")
    suspend fun getAllMovies(): Response<List<Movies>>
}