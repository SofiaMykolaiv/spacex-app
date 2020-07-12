package com.example.spacex_app.presentation.activity

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.spacex_app.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun getLayoutRes() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navController = findNavController(R.id.fragment_nav_host)
        setupActionBar(navController)
        bottom_navigation.setupWithNavController(navController = navController)
    }

    private fun setupActionBar(navController: NavController) {
        setSupportActionBar(toolbar)
        val appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(
                R.id.home_fragment,
                R.id.vehicles_fragment,
                R.id.upcoming_fragment,
                R.id.latest_fragment,
                R.id.company_fragment
            )
        )
        setupActionBarWithNavController(
            navController = navController,
            configuration = appBarConfiguration
        )
    }
}