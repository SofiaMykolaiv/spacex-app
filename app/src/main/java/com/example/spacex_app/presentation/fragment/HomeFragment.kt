package com.example.spacex_app.presentation.fragment

import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.spacex_app.R
import com.example.spacex_app.presentation.model.LaunchModel
import com.example.spacex_app.presentation.viewmodel.HomeViewModel
import com.example.spacex_app.utiles.formatToLocaleDate
import com.example.spacex_app.utiles.showSimpleErrorDialog
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.ext.android.inject

class HomeFragment : BaseFragment<HomeViewModel>() {

    override val viewModel by inject<HomeViewModel>()

    override fun getLayoutRes() = R.layout.fragment_home

    override fun onBackPressed() {
        super.onBackPressed()
        activity?.finish()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loadNextLaunch()
        observeData()
    }

    private fun loadNextLaunch() {
        viewModel.getNextLaunchNetwork()
    }

    private fun observeData() {
        viewModel.launchLiveData.observe(viewLifecycleOwner, Observer { launchModel ->
            setNextLaunchData(launchModel)
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, Observer {exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
    }

    private fun setNextLaunchData(launchModel: LaunchModel) {
//        var payloadIdNames = ""
//        launchModel.rocket?.secondStage?.payloads?.let { payloadList ->
//            for (payload in payloadList) {
//                payload.payloadId?.let { payloadId ->
//                    payloadIdNames = payloadId
//                }
//            }
//        }

        text_launched_by.text = launchModel.missionName
        text_launch_date.text = viewModel.getLaunchDate(launchModel.launchDateUtc)
        text_launchpad.text = launchModel.launchSite?.siteNameLong
        text_launchpad.text = launchModel.launchSite?.siteNameLong
        launchModel.rocket?.firstStage?.cores?.let { coreList ->
            coreList.firstOrNull()?.let { coreModel ->
                coreModel.landingVehicle?.let { landingVehicle ->
                    text_landing_zone.text = landingVehicle
                }
            }
        }
        text_static_fire.text = viewModel.getStaticFireDate(launchModel.staticFireDateUtc)
    }
}