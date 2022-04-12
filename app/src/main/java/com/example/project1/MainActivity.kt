package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val events = listOf(
        Event(
            foodTruckName: "Authentic Street Taco"
            location: "Silo Patio"
            time: "11am - 4pm"
            foodTruckDesc: "A unique blend of street taco with high-quality\n" +
                "ingredients to give you the highest quality\n" + "Mexican food."
            foodTruckWebsite: "https://www.authenticstreettaco.com/"
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}