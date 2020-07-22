package com.example.spacex_app.presentation.fragment

import com.example.spacex_app.R
import com.example.spacex_app.presentation.viewmodel.LoginViewModel
import org.koin.android.ext.android.inject

class LoginFragment : BaseFragment<LoginViewModel>() {
    override val viewModel by inject<LoginViewModel>()

    override fun getLayoutRes() = R.layout.fragment_login
}