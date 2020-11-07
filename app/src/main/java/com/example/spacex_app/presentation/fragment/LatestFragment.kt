package com.example.spacex_app.presentation.fragment

import android.os.Bundle
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spacex_app.R
import com.example.spacex_app.presentation.adapter.LaunchAdapter
import com.example.spacex_app.presentation.viewmodel.LatestViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import kotlinx.android.synthetic.main.fragment_latest.*
import org.koin.android.ext.android.inject

class LatestFragment : BaseFragment<LatestViewModel>() {

    private lateinit var launchAdapter: LaunchAdapter

    override val viewModel by inject<LatestViewModel>()

    override fun getLayoutRes() = R.layout.fragment_latest

    override fun onBackPressed() {
        super.onBackPressed()
        activity?.finish()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loadLatestLaunchList()
        setAdapter()
        observeData()
    }

    private fun setAdapter() {
        launchAdapter = LaunchAdapter()
        recycler_view.layoutManager = LinearLayoutManager(activity)
        recycler_view.adapter = launchAdapter
    }

    private fun loadLatestLaunchList() {
        viewModel.getLatestLaunchNetwork()
    }

    private fun observeData() {
        viewModel.latestLaunchLiveData.observe(viewLifecycleOwner, { list ->
            launchAdapter.launchList = list.toMutableList()
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
    }
}