package com.example.spacex_app.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex_app.databinding.ListItemHistoryBinding
import com.example.spacex_app.presentation.model.historyModel.HistoryModel

class HistoryAdapter(
    private val clickListener: (HistoryModel) -> Unit
) : RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    var historyList = mutableListOf<HistoryModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = historyList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val holder = ListItemHistoryBinding.inflate(inflater, parent, false)
        return ViewHolder(holder, clickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(historyList[position])
    }

    class ViewHolder(
        private val binding: ListItemHistoryBinding,
        private val listener: (HistoryModel) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        private lateinit var item: HistoryModel

        init {
            binding.layoutHistoryEvent.setOnClickListener { listener(item) }
        }

        fun bind(model: HistoryModel) {
            item = model
            binding.model = model
        }
    }
}