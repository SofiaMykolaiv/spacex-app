package com.example.spacex_app.presentation.fragment

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spacex_app.R
import com.example.spacex_app.presentation.adapter.MissionAdapter
import com.example.spacex_app.presentation.model.shipModel.ShipModel
import com.example.spacex_app.presentation.viewmodel.ShipDetailsViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import kotlinx.android.synthetic.main.fragment_details_ship.*
import org.koin.android.ext.android.inject

class ShipDetailsFragment : BaseFragment<ShipDetailsViewModel>() {

    private lateinit var missionAdapter: MissionAdapter

    private var shipId: String? = null

    companion object {
        private const val UNKNOWN = "Unknown"

    }

    override val viewModel by inject<ShipDetailsViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loadShipDetails()
        observeData()
        setAdapter()
    }

    override fun getLayoutRes(): Int = R.layout.fragment_details_ship

    private fun loadShipDetails() {
        viewModel.getShipDetailsNetwork(shipId)
    }

    private fun observeData() {
        viewModel.shipDetailsLiveData.observe(viewLifecycleOwner, { shipModel ->
            setShipDetailsData(shipModel)
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
        viewModel.loadingLiveData.observe(viewLifecycleOwner, { isLoading ->
            setLoadingState(isLoading)
        })
    }

    private fun setAdapter() {
        missionAdapter = MissionAdapter()
        recycler_view_mission.layoutManager = LinearLayoutManager(activity)
        recycler_view_mission.adapter = missionAdapter
    }

    private fun setShipDetailsData(shipModel: ShipModel) {
        text_home_port.text = shipModel.homePort
        text_built_date.text = shipModel.yearBuilt.toString()
        text_feature.text = shipModel.shipType
        text_model.text = shipModel.shipModel

        shipModel.roles?.let { roles ->
            if (roles[0] != null) {
                text_primary_role.text = roles[0]
            }
            if (roles[1] != null) {
                text_secondary_role.text = roles[1]
            }
        }
        text_status.text = shipModel.status
        text_coordinates.text = UNKNOWN
        text_weight.text = "${shipModel.weightKg.toString()} kg"
        text_current_speed.text = shipModel.speedKn
        shipModel.missions?.let { missionList ->
            missionAdapter.missionList = missionList.toMutableList()
        }
    }
}