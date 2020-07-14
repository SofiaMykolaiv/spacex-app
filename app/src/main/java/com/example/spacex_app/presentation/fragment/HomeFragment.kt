package com.example.spacex_app.presentation.fragment

import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.spacex_app.R
import com.example.spacex_app.presentation.viewmodel.HomeViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import org.koin.android.ext.android.inject

class HomeFragment : BaseFragment<HomeViewModel>() {
    override val viewModel by inject<HomeViewModel>()

    override fun getLayoutRes() = R.layout.fragment_home

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loadData()
        observeData()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        activity?.finish()
    }

    private fun observeData() {
        viewModel.launchLiveData.observe(viewLifecycleOwner, Observer { launchModel ->
            val data = launchModel
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, Observer { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
        viewModel.loadingLiveData.observe(viewLifecycleOwner, Observer { isLoading ->
            setLoadingState(isLoading)
        })
    }

    private fun loadData() {
        viewModel.getNextLaunchNetwork()
    }
}