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

    companion object {
        private const val COUNT_MAX = 3
    }

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
        viewModel.countLiveData.observe(viewLifecycleOwner, { count ->
            if (count == COUNT_MAX) {
                viewModel.vehiclesLiveData.value?.let { vehicleList ->
                    vehicleAdapter.vehicleList = vehicleList.toMutableList()
                }
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