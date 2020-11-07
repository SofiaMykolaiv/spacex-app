package com.example.spacex_app.presentation.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import coil.load
import com.example.spacex_app.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    
    override fun getLayoutRes() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val navController = findNavController(R.id.fragment_nav_host)
        setupActionBar(navController)
        bottom_navigation.setupWithNavController(navController = navController)
//        TODO: Show toolbar title
//        bottom_navigation.setOnNavigationItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.home_fragment -> {
//                    toolbar.title = getString(R.string.header_home)
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.vehicles_fragment -> {
//                    toolbar.title = getString(R.string.header_vehicles)
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.upcoming_fragment -> {
//                    toolbar.title = getString(R.string.header_upcoming)
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.latest_fragment -> {
//                    toolbar.title = getString(R.string.header_latest)
//                    return@setOnNavigationItemSelectedListener true
//                }
//                R.id.company_fragment -> {
//                    toolbar.title = getString(R.string.header_about_spacex)
//                    return@setOnNavigationItemSelectedListener true
//                }
//                else -> false
//            }
//        }

        image_header.load(R.drawable.bg_header)
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