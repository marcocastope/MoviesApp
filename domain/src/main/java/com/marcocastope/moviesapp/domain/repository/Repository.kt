package com.marcocastope.moviesapp.domain.repository

import com.marcocastope.moviesapp.domain.entities.MovieEntity

interface Repository {
    suspend fun getAllMovies(): List<MovieEntity>
    suspend fun getMovieById(movieId: String): MovieEntity
}