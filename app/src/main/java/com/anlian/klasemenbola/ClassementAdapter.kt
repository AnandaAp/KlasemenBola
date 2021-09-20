package com.anlian.klasemenbola

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.anlian.klasemenbola.databinding.RcLayoutBinding

class ClassementAdapter(private val context: Context, private val _list: ArrayList<ClassementDataClass>):
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
        holder.binding.cardView.setOnClickListener {
            moveToItemDetail(position)
        }
    }
    fun moveToItemDetail(position: Int){
        val intent = Intent(context,ItemDetail::class.java)
        intent.putExtra("clubName",_list[position].name)
        intent.putExtra("position",_list[position].rank)
        intent.putExtra("score",_list[position].score)
        context.startActivity(intent)
    }

    override fun getItemCount(): Int {
        return _list.size
    }
}

