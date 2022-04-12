package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val foodTrucks = listOf(
        foodTruckData(
            "Authentic Street Taco",
            "Silo Patio",
            "11am - 4pm",
            "A unique blend of street taco with high-quality " +
                    "ingredients to give you the highest quality" +
                    "Mexican food.",
            "https://www.authenticstreettaco.com/"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}