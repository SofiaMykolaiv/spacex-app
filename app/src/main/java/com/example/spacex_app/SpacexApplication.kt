package com.example.spacex_app

import android.app.Application
import com.example.spacex_app.di.viewModelModule
import com.facebook.stetho.Stetho
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class SpacexApplication : Application() {

    companion object {
        lateinit var sInstance: SpacexApplication
            private set

        val getAppInstance: SpacexApplication
            get() = sInstance
    }

    override fun onCreate() {
        super.onCreate()
        sInstance = this
        Stetho.initializeWithDefaults(this@SpacexApplication)
        Timber.plant(Timber.DebugTree())
        setKoin()
    }

    private fun setKoin() = startKoin {
        androidContext(this@SpacexApplication)
        modules(
            listOf(
                viewModelModule
//                repositoryModule,
//                networkModule,
//                serviceModule,
//                databaseModule,
//                daoModule
            )
        )
    }
}