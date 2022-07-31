package com.didi.koskita.presentation.reminder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.didi.koskita.databinding.ReminderItemBinding
import timber.log.Timber

class ReminderAdapter(private val listItem: List<String>): RecyclerView.Adapter<ReminderAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ReminderItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(name: String){
            binding.tvName.text = name
            Timber.i(name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ReminderItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listItem[position])
    }

    override fun getItemCount(): Int {
        Timber.i("Size items: ${listItem.size}")
        return listItem.size
    }
}