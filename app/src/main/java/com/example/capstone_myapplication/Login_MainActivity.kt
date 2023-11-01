package com.example.capstone_myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login_MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_main)

        val Join = Intent(this, Join_MainActivity::class.java)
        val joinButton = findViewById<Button>(R.id.joinBtn)
        joinButton.setOnClickListener {
            startActivity(Join)
        }
    }
}