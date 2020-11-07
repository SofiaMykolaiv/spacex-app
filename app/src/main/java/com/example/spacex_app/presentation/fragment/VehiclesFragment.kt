package com.example.spacex_app.presentation.fragment

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spacex_app.R
import com.example.spacex_app.presentation.activity.VehicleDetailsActivity
import com.example.spacex_app.presentation.adapter.VehicleAdapter
import com.example.spacex_app.presentation.model.vehicleModel.VehicleModel
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
        observeData()
        viewModel.getVehicleListDatabase()
    }

    private fun setAdapter() {
        vehicleAdapter = VehicleAdapter {
            onVehicleClick(it)
        }
        recycler_view.layoutManager = LinearLayoutManager(activity)
        recycler_view.adapter = vehicleAdapter
    }

    private fun observeData() {
        viewModel.vehiclesLiveData.observe(viewLifecycleOwner, { vehicleList ->
            vehicleAdapter.vehicleList = vehicleList.toMutableList()
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
    }

    private fun onVehicleClick(vehicleModel: VehicleModel) {
        // TODO: shared element transition
//        val options: ActivityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(
//            this,
//            sharedImageView,
//            ViewCompat.getTransitionName(sharedImageView)
//        )
        val intent = Intent(requireContext(), VehicleDetailsActivity::class.java)
        intent.putExtra("keyVehicleId", vehicleModel.id)
        startActivity(intent)
    }

}