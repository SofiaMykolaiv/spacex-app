package com.example.spacex_app.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spacex_app.databinding.ListItemTextBinding

//TODO: remove it later
class TextAdapter : RecyclerView.Adapter<TextAdapter.ViewHolder>() {

    var textList = mutableListOf<String>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount() = textList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val holder = ListItemTextBinding.inflate(inflater, parent, false)
        return ViewHolder(holder)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(textList[position])
    }

    class ViewHolder(private val binding: ListItemTextBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(text: String) = with(binding) {
            setText(text)
        }
    }
}