package com.example.spacex_app.presentation.fragment

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spacex_app.R
import com.example.spacex_app.presentation.adapter.LaunchAdapter
import com.example.spacex_app.presentation.viewmodel.UpcomingViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import kotlinx.android.synthetic.main.fragment_upcoming.*
import org.koin.android.ext.android.inject

class UpcomingFragment : BaseFragment<UpcomingViewModel>() {

    private lateinit var launchAdapter: LaunchAdapter

    override val viewModel by inject<UpcomingViewModel>()

    override fun getLayoutRes() = R.layout.fragment_upcoming

    override fun onBackPressed() {
        super.onBackPressed()
        activity?.finish()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setAdapter()
        loadUpcomingLaunchList()
        observeData()
    }

    private fun setAdapter() {
        launchAdapter = LaunchAdapter()
        recycler_view.layoutManager = LinearLayoutManager(activity)
        recycler_view.adapter = launchAdapter
    }

    private fun loadUpcomingLaunchList(){
        viewModel.getUpcomingLaunchNetwork()
    }

    private fun observeData(){
        viewModel.upcomingLaunchLiveData.observe(viewLifecycleOwner, {list ->
            launchAdapter.launchList = list.toMutableList()
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
    }
}