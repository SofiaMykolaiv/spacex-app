package com.example.spacex_app.presentation.fragment

import android.os.Bundle
import coil.load
import com.example.spacex_app.R
import com.example.spacex_app.presentation.model.launchModel.LaunchModel
import com.example.spacex_app.presentation.viewmodel.LaunchDetailsViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import kotlinx.android.synthetic.main.fragment_details_launch.*
import org.koin.android.ext.android.inject

class LaunchDetailsFragment : BaseFragment<LaunchDetailsViewModel>() {

    private var launchId: String? = null

    companion object {
        private const val UNKNOWN = "unknown"
    }

    override val viewModel by inject<LaunchDetailsViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loadLaunchDetails()
        observeData()
    }

    override fun getLayoutRes(): Int = R.layout.fragment_details_launch

    private fun loadLaunchDetails() {
        viewModel.getLaunchDetailsNetwork(launchId)
    }

    private fun observeData() {
        viewModel.launchDetailsLiveData.observe(viewLifecycleOwner, { launchModel ->
            setLaunchDetailsData(launchModel)
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
        viewModel.loadingLiveData.observe(viewLifecycleOwner, { isLoading ->
            setLoadingState(isLoading)
        })
    }

    private fun setLaunchDetailsData(launchModel: LaunchModel) {
        launchModel.links?.missionPatchSmall?.let { missionPatchSmall ->
            image_details_launch.load(missionPatchSmall)
        }
        text_details_launch_date.text = launchModel.launchDateUtc
        text_details_launch_location.text = launchModel.launchSite?.siteName
        text_description_launch.text = launchModel.details
        text_model.text = launchModel.rocket?.rocketName
        text_static_fire.text = launchModel.staticFireDateUtc
        text_launch_window.text

        if (launchModel.launchWindow == 0) {
            text_launch_window.text = UNKNOWN
        } else {
            text_launch_window.text = launchModel.launchWindow.toString()
        }
        launchModel.launchSuccess?.let { launchSuccess ->
            image_launch_success.isEnabled = launchSuccess
        }

        launchModel.rocket?.firstStage?.cores?.let { coreSerialList ->
            for (coreSerialItem in coreSerialList) {
                text_core_serial.text = coreSerialItem.coreSerial
                image_launch_reused.isEnabled = coreSerialItem.reused!!
                image_launch_success.isEnabled = coreSerialItem.landSuccess!!
                image_landing_legs.isEnabled = coreSerialItem.landingIntent!!
                image_gridfins.isEnabled = coreSerialItem.gridfins!!
                break
            }
        }

        launchModel.rocket?.fairings?.reused?.let { reused ->
            image_fairings_reused.isEnabled = reused
        }

        launchModel.rocket?.fairings?.recoveryAttempt?.let { recoveryAttempt ->
            image_recovery_success.isEnabled = recoveryAttempt
        }

        text_name.text = launchModel.missionName

        launchModel.rocket?.secondStage?.payloads?.let { customerSerialList ->
            for (customerSerialItem in customerSerialList) {
                customerSerialItem.customers?.let { customerList ->
                    for (customerItem in customerList) {
                        text_customer.text = customerItem
                        break
                    }
                }
                text_nationality.text = customerSerialItem.nationality
                text_weight.text = customerSerialItem.payloadMassLbs
                text_orbit.text = customerSerialItem.orbit
                text_periapsis.text = customerSerialItem.orbitParams?.periapsisKm
                text_apoapsis.text = customerSerialItem.orbitParams?.apoapsisKm
                text_inclination.text = customerSerialItem.orbitParams?.inclinationDeg
                text_period.text = customerSerialItem.orbitParams?.periodMin
                break
            }
        }
    }
}
