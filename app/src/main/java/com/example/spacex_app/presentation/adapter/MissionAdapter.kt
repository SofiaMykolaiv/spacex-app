package com.example.spacex_app.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex_app.R
import com.example.spacex_app.databinding.ListItemMissionBinding
import com.example.spacex_app.presentation.model.shipModel.MissionModel

class MissionAdapter : RecyclerView.Adapter<MissionAdapter.ViewHolder>() {

    var missionList = mutableListOf<MissionModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = missionList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val holder = ListItemMissionBinding.inflate(inflater, parent, false)
        return ViewHolder(holder)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(missionList[position])
    }

    class ViewHolder(private val binding: ListItemMissionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private lateinit var item: MissionModel

        fun bind(model: MissionModel) {
            item = model
            binding.model = model
            binding.labelMission.text = String.format(
                binding.root.context.getString(R.string.details_mission_number),
                model.flighr.toString()
            )
        }
    }
}