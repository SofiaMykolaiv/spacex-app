package com.example.spacex_app.presentation.fragment

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spacex_app.R
import com.example.spacex_app.presentation.adapter.VehicleAdapter
import com.example.spacex_app.presentation.viewmodel.VehiclesViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import kotlinx.android.synthetic.main.fragment_vehicles.*
import org.koin.android.ext.android.inject

class VehiclesFragment : BaseFragment<VehiclesViewModel>() {

    private lateinit var vehicleAdapter: VehicleAdapter

    override val viewModel by inject<VehiclesViewModel>()

    override fun getLayoutRes() = R.layout.fragment_vehicles

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setAdapter()
        viewModel.getVehicleAsyncData()
        observeData()
    }

    private fun setAdapter() {
        vehicleAdapter = VehicleAdapter()
        recycler_view.layoutManager = LinearLayoutManager(activity)
        recycler_view.adapter = vehicleAdapter
    }

    private fun observeData() {
        viewModel.vehiclesMediatorLiveData.observe(viewLifecycleOwner, { list ->
            if (viewModel.count == VehiclesViewModel.COUNT_ALL_SOURCES) {
                vehicleAdapter.vehicleList = viewModel.vehicleList
            }
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
        viewModel.loadingLiveData.observe(viewLifecycleOwner, { isLoading ->
            setLoadingState(isLoading)
        })
    }
}