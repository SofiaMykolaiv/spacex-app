package com.example.spacex_app.presentation.fragment

import com.example.spacex_app.R
import com.example.spacex_app.presentation.viewmodel.LatestViewModel
import org.koin.android.ext.android.inject

class LatestFragment : BaseFragment<LatestViewModel>() {
    override val viewModel by inject<LatestViewModel>()

    override fun getLayoutRes() = R.layout.fragment_latest
}