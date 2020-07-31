package com.example.spacex_app.presentation.fragment

import com.example.spacex_app.R
import com.example.spacex_app.presentation.viewmodel.HomeViewModel
import org.koin.android.ext.android.inject

class HomeFragment : BaseFragment<HomeViewModel>() {

    override val viewModel by inject<HomeViewModel>()

    override fun getLayoutRes() = R.layout.fragment_home

    override fun onBackPressed() {
        super.onBackPressed()
        activity?.finish()
    }
}