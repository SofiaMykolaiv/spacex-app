package com.example.spacex_app.di

import com.example.spacex_app.data.network.retrofit.service.*
import org.koin.dsl.module
import retrofit2.Retrofit

val serviceModule = module {
    single { get<Retrofit>().create(DragonService::class.java) }
    single { get<Retrofit>().create(ShipService::class.java) }
    single { get<Retrofit>().create(CapsuleService::class.java) }
    single { get<Retrofit>().create(RocketService::class.java) }
    single { get<Retrofit>().create(InfoService::class.java) }
    single { get<Retrofit>().create(LaunchService::class.java) }
    single { get<Retrofit>().create(HistoryService::class.java) }
}