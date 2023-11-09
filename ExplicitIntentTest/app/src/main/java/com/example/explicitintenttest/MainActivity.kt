package com.example.explicitintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val puri = findViewById<Button>(R.id.puri)
        val dj = findViewById<Button>(R.id.dj)
        val raj = findViewById<Button>(R.id.raj)

        puri.setOnClickListener {
            intent = Intent(applicationContext, Puri::class.java)
            startActivity(intent)
        }
        dj.setOnClickListener {
            intent = Intent(applicationContext, DJ::class.java)
            startActivity(intent)
        }
        raj.setOnClickListener {
            intent = Intent(applicationContext, Raj::class.java)
            startActivity(intent)
        }
    }
}