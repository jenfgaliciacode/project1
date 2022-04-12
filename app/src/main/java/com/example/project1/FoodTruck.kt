package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FoodTruck : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_truck)
    }

    var ID: Int
    val foodTruckName: String
    var foodTruckImg: Int
    val location: String
    val time: String
    val foodTruckDesc: String
    val foodTruckWebsite: String
}