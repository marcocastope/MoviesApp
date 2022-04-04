package com.marcocastope.moviesapp.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marcocastope.moviesapp.domain.entities.MovieEntity
import com.marcocastope.moviesapp.domain.usecases.GetAllMoviesUseCase
import kotlinx.coroutines.launch

class HomeViewModel(private val getAllMoviesUseCase: GetAllMoviesUseCase) : ViewModel() {

    private val _movies = MutableLiveData<List<MovieEntity>>()
    val movies get() = _movies

    init {
        getAllMovies()
    }

    private fun getAllMovies() {
        viewModelScope.launch {
            _movies.value = getAllMoviesUseCase.invoke()
        }
    }
}