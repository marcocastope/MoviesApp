package com.marcocastope.moviesapp.data.sources.impl

import com.marcocastope.moviesapp.data.sources.LocalDataSource
import com.marcocastope.moviesapp.data.sources.RemoteDataSource
import com.marcocastope.moviesapp.domain.entities.MovieEntity
import com.marcocastope.moviesapp.domain.repository.Repository

class RepositoryImpl(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource
) : Repository {
    override suspend fun getAllMovies(): List<MovieEntity> {
        if (localDataSource.fetchAllMovies().isEmpty()) {
            val movies = remoteDataSource.retrieveAllMovies()
            localDataSource.saveAllMovies(movies)
        }
        return localDataSource.fetchAllMovies()
    }

    override suspend fun getMovieById(movieId: String): MovieEntity {
        return localDataSource.fetchMovieById(movieId)
    }
}