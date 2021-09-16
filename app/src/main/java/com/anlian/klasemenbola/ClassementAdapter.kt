package com.anlian.klasemenbola

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.anlian.klasemenbola.databinding.RcLayoutBinding

class ClassementAdapter(private val _list: ArrayList<ClassementDataClass>):
    RecyclerView.Adapter<ClassementAdapter.ViewHolder>() {

    class ViewHolder(val binding: RcLayoutBinding): RecyclerView.ViewHolder (binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RcLayoutBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.rankValue.text = _list[position].rank.toString()
        holder.binding.clubValue.text = _list[position].name
        holder.binding.scoreValue.text = _list[position].score.toString()
    }

    override fun getItemCount(): Int {
        return _list.size
    }
}

