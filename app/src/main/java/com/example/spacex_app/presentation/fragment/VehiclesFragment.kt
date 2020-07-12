package com.example.spacex_app.presentation.fragment

import com.example.spacex_app.R
import com.example.spacex_app.presentation.viewmodel.VehiclesViewModel
import org.koin.android.ext.android.inject

class VehiclesFragment : BaseFragment<VehiclesViewModel>() {
    override val viewModel by inject<VehiclesViewModel>()

    override fun getLayoutRes() = R.layout.fragment_vehicles
}