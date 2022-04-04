package com.marcocastope.moviesapp

import android.app.Application
import com.marcocastope.moviesapp.di.appModule
import com.marcocastope.moviesapp.di.localDataSourceModule
import com.marcocastope.moviesapp.di.remoteDataSourceModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(remoteDataSourceModule, localDataSourceModule, appModule)
        }
    }
}