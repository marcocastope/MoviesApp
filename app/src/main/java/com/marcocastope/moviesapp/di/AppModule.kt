package com.marcocastope.moviesapp.di

import com.marcocastope.moviesapp.data.sources.impl.RepositoryImpl
import com.marcocastope.moviesapp.domain.repository.Repository
import com.marcocastope.moviesapp.domain.usecases.GetAllMoviesUseCase
import com.marcocastope.moviesapp.presentation.viewmodels.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    factory<Repository> { RepositoryImpl(get(), get()) }

    factory<GetAllMoviesUseCase> { GetAllMoviesUseCase(get()) }

    viewModel { HomeViewModel(get()) }
}