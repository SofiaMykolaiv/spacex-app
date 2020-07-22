package com.example.spacex_app.presentation.fragment

import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.spacex_app.R
import com.example.spacex_app.presentation.viewmodel.SplashViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import org.koin.android.ext.android.inject

class SplashFragment : BaseFragment<SplashViewModel>() {

    override val viewModel by inject<SplashViewModel>()

    override fun getLayoutRes() = R.layout.fragment_splash

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.openHome()
        observeData()
    }

    private fun observeData() {
        viewModel.splashLiveData.observe(viewLifecycleOwner, Observer {
            navigateSafe(R.id.action_splash_fragment_to_home_fragment)
        })

        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, Observer { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
    }
}