package com.example.spacex_app.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import com.example.spacex_app.R
import com.example.spacex_app.constants.ImageConstants
import com.example.spacex_app.databinding.ListItemVehicleBinding
import com.example.spacex_app.presentation.model.vehicleModel.VehicleModel

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

        fun bind(model: VehicleModel) {
            binding.model = model
            if (model.imageUrl != null) {
                binding.imageVehicle.load(model.imageUrl) {
                    crossfade(true)
                    error(R.drawable.ic_launch)
                    placeholder(R.drawable.ic_launch)
                    transformations(RoundedCornersTransformation(ImageConstants.DEFAULT_ROUNDED_CORNERS_RADIUS))
                }
            } else {
                binding.imageVehicle.load(R.drawable.ic_launch) {
                    transformations(CircleCropTransformation())
                }
            }
        }
    }
}