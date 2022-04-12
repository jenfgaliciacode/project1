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
        ),
        foodTruckData(
            "Shah's Halal",
            "Silo Patio",
            "12am - 4pm",
            "Owned and operated by Tory Mashriqi, Shah’s\n" +
                    "Halal Foods serves strictly Halal certified meats\n" +
                    "and features a menu of several Mediterranean\n" +
                    "inspired items including rice, salad, homemade\n" +
                    "sauces, lamb, chicken and falafel. Made fresh,\n" +
                    "they are cooked over a large flat griddle.",
            "https://shahshalalfood.myfreesites.net/"
        ),
        foodTruckData(
            "Star Ginger ",
            "Silo Patio",
            "1pm - 4pm",
            "Fresh Asian flavors for campus, corporate, government, healthcare and leisure",
            "https://www.starginger.com/"
        ),
        foodTruckData(
            "Bangin Bowls",
            "Tercero DC",
            "2pm - 6pm",
            "We are a Latin fusion food truck buffet, inspired\n" +
                    "by South American and Caribbean food, to bring\n" +
                    "to our beloved city Sacramento something\n" +
                    "different, healthy, with many flavors and with\n" +
                    "fresh grilled meats. Bangin 'Bowls was created\n" +
                    "with the purpose of taking a typical Latin food to\n" +
                    "another level, such as our famous BOWLS with a\n" +
                    "street style, our FRIES CARGADAS and\n" +
                    "CHURROS SUNDAE always thinking about what\n" +
                    "our customers would like and giving the best of\n" +
                    "us.",
            "https://www.labanginbowls.com/"
        ),
        foodTruckData(
            "Hefty Gyros",
            "Storer Hall",
            "1pm - 4pm",
            "efty Gyros is a family owned and operated food\n" +
                    "truck that serves delicious and great quality food.\n" +
                    "As a family owned business, we put our heart\n" +
                    "and soul with passion to serve the most\n" +
                    "authentic and delicious Mediterranean food.",
            "https://heftygyros.com/"
        ),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}