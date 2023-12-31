package com.example.capstone_myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.capstone_myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var imogeRecyclerView1 : RecyclerView
    lateinit var tvDate : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imogeRecyclerView1 = findViewById(R.id.imogerecyclerHorizon)


        //버튼 눌렀을때 측정 로딩으로 넘어감
        val Loading = Intent(this, Loading_MainActivity::class.java)
        val L_Button = findViewById<Button>(R.id.measure_Button)
        L_Button.setOnClickListener {
            startActivity(Loading)
        }
        val play = Intent(this, Playlist_MainActivity::class.java)
        val P_Button = findViewById<Button>(R.id.playlist_Button)
        P_Button.setOnClickListener {
            startActivity(play)
        }
        val linearLayoutManager = LinearLayoutManager(this as Context)

        val recyclerView = findViewById<RecyclerView>(R.id.imogerecyclerHorizon)
        recyclerView.setLayoutManager(linearLayoutManager) // LayoutManager 설정


        val binding = ActivityMainBinding.inflate(layoutInflater)
        // 로딩 애니메이션, 강현이 플레이리스트 레이아웃 연결하기
    }

}

class Dataimoji(val imgprofile:Drawable?, val strName:String){

}


