package com.example.spacex_app.di

import com.example.spacex_app.data.repository.CapsuleRepository
import com.example.spacex_app.data.repository.DragonRepository
import com.example.spacex_app.data.repository.RocketRepository
import com.example.spacex_app.data.repository.ShipRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { DragonRepository() }
    single { ShipRepository() }
    single { CapsuleRepository() }
    single { RocketRepository() }
}