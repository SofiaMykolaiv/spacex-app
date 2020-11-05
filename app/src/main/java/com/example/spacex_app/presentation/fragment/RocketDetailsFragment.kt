package com.example.spacex_app.presentation.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.observe
import com.example.spacex_app.R
import com.example.spacex_app.presentation.model.rocketModel.RocketModel
import com.example.spacex_app.presentation.viewmodel.RocketDetailsViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import kotlinx.android.synthetic.main.fragment_details_rocket.*
import org.koin.android.ext.android.inject

class RocketDetailsFragment : BaseFragment<RocketDetailsViewModel>() {

    private var rocketId: String? = null

    override val viewModel by inject<RocketDetailsViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loadRocketDetails()
        observeData()
    }

    override fun getLayoutRes(): Int = R.layout.fragment_details_rocket

    private fun loadRocketDetails() {
        viewModel.getRocketDetailsNetwork(rocketId)
    }

    private fun observeData() {
        viewModel.rocketDetailsLiveData.observe(viewLifecycleOwner) { rocketModel ->
            setRocketDetailsData(rocketModel)
        }
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner) { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        }
        viewModel.loadingLiveData.observe(viewLifecycleOwner) { isLoading ->
            setLoadingState(isLoading)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setRocketDetailsData(rocketModel: RocketModel) {
        text_maiden_launch.text = rocketModel.firstFlight
        text_launch_cost.text = rocketModel.costPerLaunch.toString()
        text_success_rate.text = rocketModel.successRatePct.toString()
        text_description.text = rocketModel.description
        text_rocket_stages.text = rocketModel.stages.toString()
        text_height.text = rocketModel.height?.meters.toString()
        text_diameter.text = rocketModel.diameter?.meters.toString()
        text_fairing_height.text =
            rocketModel.secondStage?.payloads?.compositeFairing?.height?.meters.toString()
        text_fairing_diameter.text =
            rocketModel.secondStage?.payloads?.compositeFairing?.diameter?.meters.toString()

        rocketModel.payloadWeights?.let { payloadWeightList ->
            for (payloadWeightItem in payloadWeightList) {
                text_low_earth_orbit.text = payloadWeightItem.kg.toString()
                break
            }
        }

        text_first_stage_thrust.text = rocketModel.firstStage?.thrustSeaLevel?.kN.toString()
        text_fuel_amount.text = rocketModel.firstStage?.fuelAmountTons.toString()
        text_engines.text = rocketModel.firstStage?.engines.toString()

        rocketModel.secondStage?.reusable?.let { reusable ->
            image_reusable.isEnabled = reusable
        }
        text_second_stage_thrust.text = rocketModel.secondStage?.thrust?.kN.toString()
        text_fuel_amount_second.text = rocketModel.firstStage?.fuelAmountTons.toString()
        text_engines_second.text = rocketModel.firstStage?.engines.toString()

        rocketModel.secondStage?.reusable?.let { reusable ->
            image_reusable_second.isEnabled = reusable
        }
        text_model.text =
            "${rocketModel.engines?.type.toString()} ${rocketModel.engines?.version.toString()}"
        text_thrust_to_weight.text = rocketModel.engines?.thrustToWeight.toString()
        text_fuel.text = rocketModel.engines?.propellant2.toString()
        text_oxidizer.text = rocketModel.engines?.propellant1.toString()
        text_sea_level_thrust.text = rocketModel.engines?.thrustSeaLevel?.kN.toString()
        text_vacuum_thrust.text = rocketModel.engines?.thrustVacuum?.kN.toString()
        text_sea_level_isp.text = rocketModel.engines?.isp?.seaLevel.toString()
        text_vacuum_isp.text = rocketModel.engines?.isp?.vacuum.toString()
    }
}