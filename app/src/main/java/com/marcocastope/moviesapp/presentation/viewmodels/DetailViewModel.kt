package com.marcocastope.moviesapp.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marcocastope.moviesapp.domain.entities.MovieEntity
import com.marcocastope.moviesapp.domain.usecases.GetMovieUseCase
import kotlinx.coroutines.launch

class DetailViewModel(private val getMovieUseCase: GetMovieUseCase) : ViewModel() {

    private val _movie = MutableLiveData<MovieEntity>()
    val movie get() = _movie

    fun getMovieById(movieId: String) {
        viewModelScope.launch {
            _movie.value = getMovieUseCase.invoke(movieId)
        }
    }
}