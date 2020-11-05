package com.example.spacex_app.presentation.fragment

import android.os.Bundle
import com.example.spacex_app.R
import com.example.spacex_app.presentation.model.dragonModel.DragonModel
import com.example.spacex_app.presentation.viewmodel.DragonDetailsViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import kotlinx.android.synthetic.main.fragment_details_dragon.*
import org.koin.android.ext.android.inject

class DragonDetailsFragment : BaseFragment<DragonDetailsViewModel>() {

    private val dragonId: String? = null

    override val viewModel by inject<DragonDetailsViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loadDragonsDetails()
        observeData()
    }

    override fun getLayoutRes(): Int = R.layout.fragment_details_dragon

    private fun loadDragonsDetails() {
        viewModel.getDragonDetailsNetwork(dragonId)
    }

    private fun observeData() {
        viewModel.dragonDetailsLiveData.observe(viewLifecycleOwner, { dragonModel ->
            setDragonDetailsData(dragonModel)
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
        viewModel.loadingLiveData.observe(viewLifecycleOwner, { isLoading ->
            setLoadingState(isLoading)
        })
    }

    private fun setDragonDetailsData(dragonModel: DragonModel) {
        text_maiden_launch.text = dragonModel.firstFlight
        text_crew_capacity.text = dragonModel.crewCapacity.toString()

        dragonModel.active?.let { active ->
            image_active.isEnabled = active
        }

        text_description.text = dragonModel.description
        text_launch_payload.text = dragonModel.launchPayloadMass?.kg.toString()
        text_return_payload.text = dragonModel.returnPayloadMass?.kg.toString()

        dragonModel.trunk?.cargo?.unpressurizedCargo?.let { reusable ->
            image_details_reusable.isEnabled = reusable

        }
        text_height.text = dragonModel.heightWTrunk?.meters.toString()
        text_diameter.text = dragonModel.diameter?.meters.toString()
        text_dry_weight.text = dragonModel.dryMassKg.toString()

        dragonModel.thrusters?.let { thrusterList ->
            for (thrusterItem in thrusterList) {
                text_model_thrusters.text = thrusterItem.type
                text_amount.text = thrusterItem.amount.toString()
                text_primary_fuel.text = thrusterItem.fuel_1
                text_oxidizer.text = thrusterItem.fuel_2
                text_thrust.text = thrusterItem.thrust?.kN.toString()
                text_isp.text = thrusterItem.isp.toString()
                break
            }
        }
    }
}