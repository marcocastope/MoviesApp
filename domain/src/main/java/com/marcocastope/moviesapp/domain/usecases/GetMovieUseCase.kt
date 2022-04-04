package com.marcocastope.moviesapp.domain.usecases

import com.marcocastope.moviesapp.domain.entities.MovieEntity
import com.marcocastope.moviesapp.domain.repository.Repository

class GetMovieUseCase(private val repository: Repository) {

    suspend fun invoke(movieId: String): MovieEntity = repository.getMovieById(movieId)
}