package com.example.lesson14_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val activity: MainActivity) : RecyclerView.Adapter<ListViewHolder>() {

    var model: List<User> = listOf()

    fun setData(data: List<User>){
        model = data
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ListViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return model.size
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.populateModel(model[position], activity)
    }
}