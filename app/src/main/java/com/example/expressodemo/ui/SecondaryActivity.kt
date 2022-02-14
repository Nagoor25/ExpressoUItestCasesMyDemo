package com.example.expressodemo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.expressodemo.R
import kotlinx.android.synthetic.main.activity_secondary.*

class SecondaryActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        button_back.setOnClickListener {
            onBackPressed()
        }
    }
}