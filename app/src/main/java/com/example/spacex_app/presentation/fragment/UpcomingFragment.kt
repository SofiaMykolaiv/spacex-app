package com.example.spacex_app.presentation.fragment

import com.example.spacex_app.R
import com.example.spacex_app.presentation.viewmodel.UpcomingViewModel
import org.koin.android.ext.android.inject

class UpcomingFragment : BaseFragment<UpcomingViewModel>() {
    override val viewModel by inject<UpcomingViewModel>()

    override fun getLayoutRes() = R.layout.fragment_upcoming
}