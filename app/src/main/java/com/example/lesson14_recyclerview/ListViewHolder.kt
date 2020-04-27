package com.example.lesson14_recyclerview

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title: TextView = itemView.tvTitle
    val description: TextView = itemView.tvDescription

    fun populateModel(user: User,activity: MainActivity){
        itemView.tvTitle.text = user.title
        itemView.tvDescription.text = user.description

        itemView.setOnClickListener {
            activity.onItemClicked(user)
        }
    }

}