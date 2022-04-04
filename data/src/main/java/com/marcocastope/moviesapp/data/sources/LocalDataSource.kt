package com.marcocastope.moviesapp.data.sources

import com.marcocastope.moviesapp.domain.entities.MovieEntity

interface LocalDataSource {

    suspend fun fetchAllMovies(): List<MovieEntity>

    suspend fun fetchMovieById(movieId: String): MovieEntity

    suspend fun saveAllMovies(movies: List<MovieEntity>)
}