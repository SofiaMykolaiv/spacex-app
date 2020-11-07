package com.example.spacex_app.di

import com.example.spacex_app.data.database.AppDatabase
import org.koin.dsl.module

val daoModule = module {
    single { get<AppDatabase>().vehicleDao() }
}