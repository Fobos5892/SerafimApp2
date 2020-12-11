package com.example.serafimapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_Hallo).setOnClickListener {
            Log.e("!@#:", "button_Hallo")
        }
        findViewById<Button>(R.id.button_hi).setOnClickListener {
            Log.e("!@#:", "button_hi")
        }
        findViewById<Button>(R.id.button_bye).setOnClickListener {
            Log.e("!@#:", "button_bye")
        }
    }
}