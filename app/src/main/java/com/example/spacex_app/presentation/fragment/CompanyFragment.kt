package com.example.spacex_app.presentation.fragment

import android.net.Uri
import android.os.Bundle
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.spacex_app.R
import com.example.spacex_app.presentation.adapter.HistoryAdapter
import com.example.spacex_app.presentation.model.historyModel.HistoryModel
import com.example.spacex_app.presentation.model.infoModel.InfoModel
import com.example.spacex_app.presentation.viewmodel.CompanyViewModel
import com.example.spacex_app.utiles.showSimpleErrorDialog
import kotlinx.android.synthetic.main.fragment_company.*
import org.koin.android.ext.android.inject

class CompanyFragment : BaseFragment<CompanyViewModel>() {

    private lateinit var historyAdapter: HistoryAdapter

    override val viewModel by inject<CompanyViewModel>()

    override fun getLayoutRes() = R.layout.fragment_company

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setAdapter()
        loadData()
        observeData()
    }

    private fun loadData() {
        viewModel.getCompanyAsyncData()
    }

    private fun observeData() {
        viewModel.companyInfoLiveData.observe(viewLifecycleOwner, { infoModel ->
            setData(infoModel)
        })
        viewModel.historyLiveData.observe(viewLifecycleOwner, { historyList ->
            historyAdapter.historyList = historyList.toMutableList()
        })
        viewModel.errorMessageLiveData.observe(viewLifecycleOwner, { exceptionMessage ->
            showSimpleErrorDialog(context, null, exceptionMessage, null, null)
        })
    }

    private fun setAdapter() {
        historyAdapter = HistoryAdapter { onItemClick(it) }
        recycler_view_achievements.layoutManager = LinearLayoutManager(activity)
        recycler_view_achievements.adapter = historyAdapter
    }

    private fun setData(infoModel: InfoModel) {
        text_founded_in.text = String.format(
            getString(R.string.company_founded_in_x_by_elon_musk),
            infoModel.founded,
            infoModel.founder
        )
        text_ceo.text = infoModel.ceo
        text_cto.text = infoModel.cto
        text_coo.text = infoModel.coo
        text_valuation.text = infoModel.valuation.toString()
        text_location.text = String.format(
            getString(R.string.company_city_state),
            infoModel.headquarters?.city,
            infoModel.headquarters?.state
        )
        text_employees.text = infoModel.employees.toString()
        text_summary.text = infoModel.summary
    }

    private fun onItemClick(historyModel: HistoryModel) {
        CustomTabsIntent.Builder().build()
            .launchUrl(requireContext(), Uri.parse(historyModel.links?.article))
    }
}