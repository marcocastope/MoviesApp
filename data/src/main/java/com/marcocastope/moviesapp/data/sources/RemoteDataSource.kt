package com.marcocastope.moviesapp.data.sources

import com.marcocastope.moviesapp.domain.entities.MovieEntity

interface RemoteDataSource {

    suspend fun retrieveAllMovies(): List<MovieEntity>
}