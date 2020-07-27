package com.example.spacex_app.presentation.fragment

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spacex_app.R
import com.example.spacex_app.presentation.adapter.TextAdapter
import com.example.spacex_app.presentation.viewmodel.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.ext.android.inject

class HomeFragment : BaseFragment<HomeViewModel>() {

    private lateinit var textAdapter: TextAdapter

    override val viewModel by inject<HomeViewModel>()

    override fun getLayoutRes() = R.layout.fragment_home

    override fun onBackPressed() {
        super.onBackPressed()
        activity?.finish()

        // TODO: remove it later
        textAdapter = TextAdapter()
        recycler_view.layoutManager = LinearLayoutManager(activity)
        recycler_view.adapter = textAdapter
        textAdapter.textList = arrayListOf(
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14"
        ).toMutableList()
    }
}