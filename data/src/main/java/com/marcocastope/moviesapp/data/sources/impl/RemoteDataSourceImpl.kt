package com.marcocastope.moviesapp.data.sources.impl

import com.marcocastope.moviesapp.data.api.MovieService
import com.marcocastope.moviesapp.data.sources.RemoteDataSource
import com.marcocastope.moviesapp.domain.entities.MovieEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RemoteDataSourceImpl(private val movieService: MovieService) : RemoteDataSource {

    private val apiKey = "6d725a6b548a8a278321f65fd6abcc3d"

    override suspend fun retrieveAllMovies(): List<MovieEntity> = withContext(Dispatchers.IO) {
        val data = movieService.retrieveAllMovies(apiKey).body()
        data?.results ?: emptyList()
    }
}