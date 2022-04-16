package com.example.project1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private var foodTrucks: List<FoodTruckData>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val itemImageView: ImageView = itemView.findViewById(R.id.item_image)
        val nameTextView: TextView = itemView.findViewById(R.id.item_title)
        val locationTextView: TextView = itemView.findViewById(R.id.item_location)
        val timeTextView: TextView = itemView.findViewById(R.id.item_time)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.activity_food_truck_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val foodtruck = foodTrucks[position]

        holder.apply {
            itemImageView.setImageResource (foodtruck.image)
            nameTextView.text = foodtruck.name
            locationTextView.text = foodtruck.location
            timeTextView.text = foodtruck.time
        }
    }

    override fun getItemCount() = foodTrucks.size

}