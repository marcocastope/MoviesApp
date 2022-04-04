package com.marcocastope.moviesapp.di

import androidx.room.Room
import com.marcocastope.moviesapp.data.database.MovieDatabase
import com.marcocastope.moviesapp.data.sources.LocalDataSource
import com.marcocastope.moviesapp.data.sources.impl.LocalDataSourceImpl
import org.koin.dsl.module

val localDataSourceModule = module {
    single {
        Room.databaseBuilder(get(), MovieDatabase::class.java, "movie-database").build().movieDao()
    }

    single<LocalDataSource> { LocalDataSourceImpl(get()) }
}
