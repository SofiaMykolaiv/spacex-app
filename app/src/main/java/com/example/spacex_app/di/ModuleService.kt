package com.example.spacex_app.di

import com.example.spacex_app.data.network.retrofit.service.CapsuleService
import com.example.spacex_app.data.network.retrofit.service.DragonService
import com.example.spacex_app.data.network.retrofit.service.RocketService
import com.example.spacex_app.data.network.retrofit.service.ShipService
import org.koin.dsl.module
import retrofit2.Retrofit

val serviceModule = module {
    single { get<Retrofit>().create(DragonService::class.java) }
    single { get<Retrofit>().create(ShipService::class.java) }
    single { get<Retrofit>().create(CapsuleService::class.java) }
    single { get<Retrofit>().create(RocketService::class.java) }

}