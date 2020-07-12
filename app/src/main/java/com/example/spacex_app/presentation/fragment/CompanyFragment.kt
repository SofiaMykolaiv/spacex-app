package com.example.spacex_app.presentation.fragment

import com.example.spacex_app.R
import com.example.spacex_app.presentation.viewmodel.CompanyViewModel
import org.koin.android.ext.android.inject

class CompanyFragment : BaseFragment<CompanyViewModel>() {
    override val viewModel by inject<CompanyViewModel>()

    override fun getLayoutRes() = R.layout.fragment_company
}