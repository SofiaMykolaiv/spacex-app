package com.example.spacex_app.presentation.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.navigation.findNavController
import com.example.spacex_app.R

class VehicleDetailsActivity : BaseActivity() {
    override fun getLayoutRes(): Int = R.layout.activity_vehicle_details

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val id = intent?.extras?.getString("keyVehicleId")
        val bundle = Bundle()
        bundle.putString("keyVehicleId", id)
        findNavController(R.id.fragment_nav_host).navigate(R.id.vehicles_fragment, bundle)
    }
}