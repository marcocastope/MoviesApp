package com.marcocastope.moviesapp.domain.usecases

import com.marcocastope.moviesapp.domain.entities.MovieEntity
import com.marcocastope.moviesapp.domain.repository.Repository

class GetAllMoviesUseCase(private val repository: Repository) {

    suspend fun invoke(): List<MovieEntity> = repository.getAllMovies()
}