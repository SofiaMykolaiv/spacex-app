package com.example.spacex_app.presentation.fragment

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.spacex_app.R
import com.example.spacex_app.presentation.activity.MainActivity
import com.example.spacex_app.presentation.activity.SignInActivity
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
            startActivity(Intent(context, MainActivity::class.java))
            activity?.finish()
        })

        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, Observer { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
    }
}