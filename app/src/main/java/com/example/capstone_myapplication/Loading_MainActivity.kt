package com.example.capstone_myapplication

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Loading_MainActivity : AppCompatActivity() {
    private lateinit var LoadingAnimation: AnimationDrawable


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading_main)

        val rocketImage = findViewById<ImageView>(R.id.imageView).apply {
            setBackgroundResource(R.drawable.loading)
            LoadingAnimation = background as AnimationDrawable
        }
        rocketImage.setOnClickListener({ LoadingAnimation.start() })


    }

}