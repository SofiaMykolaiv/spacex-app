package com.example.spacex_app.presentation.fragment

import android.os.Bundle
import coil.load
import coil.transform.RoundedCornersTransformation
import com.example.spacex_app.R
import com.example.spacex_app.presentation.model.vehicleModel.VehicleModel
import com.example.spacex_app.presentation.viewmodel.VehicleDetailsViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import kotlinx.android.synthetic.main.fragment_details_vehicle.*
import org.koin.android.ext.android.inject

class VehicleDetailsFragment : BaseFragment<VehicleDetailsViewModel>() {

    override val viewModel by inject<VehicleDetailsViewModel>()

    override fun getLayoutRes(): Int = R.layout.fragment_details_vehicle

    override fun onBackPressed() {
        super.onBackPressed()
        activity?.finish()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        observeData()

        val id = activity?.intent?.getStringExtra("keyVehicleId") ?: ""
        viewModel.getVehicleDetails(id)
    }

    private fun observeData() {
        viewModel.vehicleDetailsLiveData.observe(viewLifecycleOwner, { vehicleModel ->
            setVehicleDetails(vehicleModel)
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
    }

    private fun setVehicleDetails(vehicleModel: VehicleModel) {
        image_details_vehicle.load(vehicleModel.imageUrl) {
            transformations(RoundedCornersTransformation(14f, 14f, 0f, 0f))
        }
        text_built_date.text = vehicleModel.buildDate
        text_description.text = vehicleModel.description
        text_vehicle_title.text = vehicleModel.name
    }
}