package com.example.capstone_myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Join_MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_main)

        val JoinCancel = Intent(this, Login_MainActivity::class.java)
        val joinCancelButton = findViewById<Button>(R.id.joinCancel)
        joinCancelButton.setOnClickListener {
            startActivity(JoinCancel)
        }
    }
}