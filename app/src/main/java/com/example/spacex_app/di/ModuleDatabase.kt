package com.example.spacex_app.di

import android.content.Context
import androidx.room.Room
import com.example.spacex_app.data.database.AppDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

private const val DATABASE_NAME = "Space-X-Database"

val databaseModule = module {
    single { provideDatabase(context = androidContext()) }
}

private fun provideDatabase(context: Context): AppDatabase =
    Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        DATABASE_NAME
    ).fallbackToDestructiveMigration()
        .build()