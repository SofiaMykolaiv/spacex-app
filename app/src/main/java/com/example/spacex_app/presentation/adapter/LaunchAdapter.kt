package com.example.spacex_app.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex_app.databinding.ListItemLaunchBinding

class LaunchAdapter : RecyclerView.Adapter<LaunchAdapter.ViewHolder>() {

    var launchList = mutableListOf<String>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = launchList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val holder = ListItemLaunchBinding.inflate(inflater, parent, false)
        return ViewHolder(holder)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.bind(launchList[position])
    }

    class ViewHolder(private val binding: ListItemLaunchBinding) :
        RecyclerView.ViewHolder(binding.root) {

//        fun bind(model: LaunchModel) {
//            binding.model = model
//        }
    }
}