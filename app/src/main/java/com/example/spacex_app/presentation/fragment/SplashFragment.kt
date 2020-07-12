package com.example.spacex_app.presentation.fragment

import com.example.spacex_app.R
import com.example.spacex_app.presentation.viewmodel.SplashViewModel
import org.koin.android.ext.android.inject

class SplashFragment : BaseFragment<SplashViewModel>() {
    override val viewModel by inject<SplashViewModel>()

    override fun getLayoutRes() = R.layout.fragment_splash
}