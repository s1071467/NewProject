package com.example.newprojrct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game_page1.*

class GamePage1 : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_page1)
        imgHappy.setOnClickListener(this)
        imgAngry.setOnClickListener(this)
        imgCry.setOnClickListener(this)
        imgtoCameraX.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(v.id.equals(R.id.imgHappy)){
           TODO()
        }else if(v.id.equals(R.id.imgAngry)){
            TODO()
        }else if(v.id.equals(R.id.imgCry)){
            TODO()
        }else{
            TODO()
        }

    }
}