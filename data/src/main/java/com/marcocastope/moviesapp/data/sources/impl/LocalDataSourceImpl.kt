package com.marcocastope.moviesapp.data.sources.impl

import com.marcocastope.moviesapp.data.database.MovieDao
import com.marcocastope.moviesapp.data.sources.LocalDataSource
import com.marcocastope.moviesapp.domain.entities.MovieEntity

class LocalDataSourceImpl(private val movieDao: MovieDao) : LocalDataSource {
    override suspend fun fetchAllMovies(): List<MovieEntity> {
        return movieDao.fetchAllMovies()
    }

    override suspend fun fetchMovieById(movieId: String): MovieEntity {
        return movieDao.fetchMovieById(movieId)
    }

    override suspend fun saveAllMovies(movies: List<MovieEntity>) {
        movieDao.saveAllMovies(movies)
    }
}