package com.example.spacex_app.di

import com.example.spacex_app.presentation.viewmodel.*
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel() }
    viewModel { CompanyViewModel() }
    viewModel { LatestViewModel() }
    viewModel { LoginViewModel() }
    viewModel { RegistrationViewModel() }
    viewModel { SplashViewModel() }
    viewModel { UpcomingViewModel() }
    viewModel { VehiclesViewModel() }
    viewModel { ShipDetailsViewModel() }
    viewModel { RocketDetailsViewModel() }
    viewModel { LaunchDetailsViewModel() }
    viewModel { DragonDetailsViewModel() }
}