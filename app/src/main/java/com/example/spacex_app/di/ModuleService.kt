package com.example.spacex_app.di

import com.example.spacex_app.data.network.service.InfoService
import org.koin.dsl.module
import retrofit2.Retrofit

val serviceModule = module {
    single { get<Retrofit>().create(InfoService::class.java) }
}