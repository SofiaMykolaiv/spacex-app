package com.example.spacex_app.di

import com.example.spacex_app.data.network.retrofit.service.DragonService
import org.koin.dsl.module
import retrofit2.Retrofit

val serviceModule = module {
    single { get<Retrofit>().create(DragonService::class.java) }
}