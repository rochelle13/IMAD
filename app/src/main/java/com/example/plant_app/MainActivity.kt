package com.example.plant_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    //declaring variables
    private lateinit var sunlightButton: Button
    private lateinit var imageViewPlant: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializing variables
        sunlightButton = findViewById(R.id.btnSunlight)
        imageViewPlant =findViewById(R.id.imageViewPlant)

        //changing image when button is clicked
        sunlightButton.setOnClickListener{
            imageViewPlant.setImageResource(R.drawable.sunlight)
        }
    }
}