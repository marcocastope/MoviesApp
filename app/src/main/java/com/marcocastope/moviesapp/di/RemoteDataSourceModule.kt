package com.marcocastope.moviesapp.di

import com.marcocastope.moviesapp.data.api.MovieService
import com.marcocastope.moviesapp.data.sources.RemoteDataSource
import com.marcocastope.moviesapp.data.sources.impl.RemoteDataSourceImpl
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.BuildConfig
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val URL_IMAGES = "https://image.tmdb.org/t/p/w500/"

val remoteDataSourceModule = module {

    //factory { MovieDataRemoteMapper() }

    single(named("BASE_URL")) {
        "https://api.themoviedb.org/3/movie/"
    }

    single {
        val interceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        interceptor
    }

    single {
        val client = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            client.addInterceptor(get<HttpLoggingInterceptor>())
        }
        client.build()
    }

    single {
        Moshi.Builder()
            .build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(get<String>(named("BASE_URL")))
            .addConverterFactory(MoshiConverterFactory.create(get()))
            .client(get())
            .build()
    }

    single {
        get<Retrofit>().create(MovieService::class.java)
    }

    single<RemoteDataSource> { RemoteDataSourceImpl(get()) }
}