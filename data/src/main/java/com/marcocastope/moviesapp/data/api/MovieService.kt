package com.marcocastope.moviesapp.data.api

import com.marcocastope.moviesapp.data.model.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("upcoming?page=1")
    suspend fun retrieveAllMovies(@Query("api_key") apiKey: String): Response<MovieResponse>
}