package com.didi.koskita.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.didi.koskita.databinding.RuleItemBinding

class RuleAdapter(private val listItem: List<String>): RecyclerView.Adapter<RuleAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: RuleItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(name: String){
            with(binding){
                tvName.text = name
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RuleAdapter.ViewHolder {
        val binding = RuleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RuleAdapter.ViewHolder, position: Int) {
        holder.bind(listItem[position])
    }

    override fun getItemCount(): Int = listItem.size
}