package com.example.spacex_app.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import com.example.spacex_app.R
import com.example.spacex_app.constants.ImageConstants
import com.example.spacex_app.databinding.ListItemLaunchBinding
import com.example.spacex_app.presentation.model.launchModel.LaunchModel
import com.example.spacex_app.utiles.formatToLocaleDate

class LaunchAdapter : RecyclerView.Adapter<LaunchAdapter.ViewHolder>() {

    var launchList = mutableListOf<LaunchModel>()
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
        holder.bind(launchList[position])
    }

    class ViewHolder(private val binding: ListItemLaunchBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(model: LaunchModel) {
            binding.model = model
            binding.tvDate.text = formatToLocaleDate(model.launchDateUtc)
            if (model.links?.missionPatchSmall != null) {
                binding.imageLaunch.load(model.links?.missionPatchSmall) {
                    crossfade(true)
                    error(R.drawable.ic_launch)
                    placeholder(R.drawable.ic_launch)
                    transformations(RoundedCornersTransformation(ImageConstants.DEFAULT_ROUNDED_CORNERS_RADIUS))
                }
            } else {
                binding.imageLaunch.load(R.drawable.ic_launch) {
                    transformations(CircleCropTransformation())
                }
            }
        }
    }
}