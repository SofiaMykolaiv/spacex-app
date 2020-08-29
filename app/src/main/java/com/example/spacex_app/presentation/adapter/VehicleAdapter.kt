package com.example.spacex_app.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex_app.databinding.ListItemVehicleBinding
import com.example.spacex_app.presentation.model.vehicleModel.VehicleModel
import com.example.spacex_app.utiles.loadImageUrl

class VehicleAdapter : RecyclerView.Adapter<VehicleAdapter.ViewHolder>() {

    var vehicleList = mutableListOf<VehicleModel>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = vehicleList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val holder = ListItemVehicleBinding.inflate(inflater, parent, false)
        return ViewHolder(holder)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(vehicleList[position])
    }

    class ViewHolder(private val binding: ListItemVehicleBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind( model: VehicleModel) {
            binding.model = model
            binding.imageVehicle.loadImageUrl(model.imageUrl)
        }
    }
}