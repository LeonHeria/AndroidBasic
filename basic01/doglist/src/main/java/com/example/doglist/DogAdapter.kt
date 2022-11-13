package com.example.doglist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(
    private val context: Context?,
    private val layout: Int,
    private val doglist:List<Dog>
) : RecyclerView.Adapter<DogAdapter.DogCardViewHolder>() {

    // TODO: Initialize the data using the List found in data/DataSource

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        val dogImage: ImageView = view!!.findViewById(R.id.img_dog)
        val dogName: TextView = view!!.findViewById(R.id.tv_dog_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(layout,parent,false)
        return DogCardViewHolder(layout)
    }

    override fun getItemCount(): Int = doglist.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val item = doglist[position]
        holder.dogName.text = item.name
        holder.dogImage.setImageResource(item.imageResourceId)
    }
}