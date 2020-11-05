package com.example.spacex_app.di

import com.example.spacex_app.data.repository.*
import org.koin.dsl.module

val repositoryModule = module {
    single { Repository() }
    factory {  }
}