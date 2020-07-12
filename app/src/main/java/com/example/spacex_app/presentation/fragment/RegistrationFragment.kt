package com.example.spacex_app.presentation.fragment

import com.example.spacex_app.R
import com.example.spacex_app.presentation.viewmodel.RegistrationViewModel
import org.koin.android.ext.android.inject

class RegistrationFragment : BaseFragment<RegistrationViewModel>() {
    override val viewModel by inject<RegistrationViewModel>()

    override fun getLayoutRes() = R.layout.fragment_registration
}