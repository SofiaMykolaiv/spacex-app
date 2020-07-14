package com.example.spacex_app.di

import com.example.spacex_app.data.network.retrofit.service.LaunchService
import org.koin.dsl.module
import retrofit2.Retrofit

val serviceModule = module {
    single { get<Retrofit>().create(LaunchService::class.java) }
}