package com.example.spacex_app

import android.app.Application
import com.example.spacex_app.di.*
import com.facebook.stetho.Stetho
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class SpacexApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this@SpacexApplication)
        Timber.plant(Timber.DebugTree())
        setKoin()
    }

    private fun setKoin() = startKoin {
        androidContext(this@SpacexApplication)
        modules(
            listOf(
                viewModelModule,
                repositoryModule,
                networkModule,
                serviceModule,
                databaseModule,
                daoModule
            )
        )
    }
}