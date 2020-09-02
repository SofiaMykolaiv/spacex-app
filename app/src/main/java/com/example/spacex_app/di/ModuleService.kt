package com.example.spacex_app.di

import com.example.spacex_app.data.network.service.ApiService
import org.koin.dsl.module
import retrofit2.Retrofit

val serviceModule = module {
    single { get<Retrofit>().create(ApiService::class.java) }
}