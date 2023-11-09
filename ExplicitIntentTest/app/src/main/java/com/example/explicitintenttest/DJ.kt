package com.example.explicitintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DJ : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dj)

        val puri = findViewById<Button>(R.id.puri)
        val raj = findViewById<Button>(R.id.raj)
        val guj = findViewById<Button>(R.id.guj)

        puri.setOnClickListener {
            intent = Intent(applicationContext, Puri::class.java)
            startActivity(intent)
        }
        raj.setOnClickListener {
            intent = Intent(applicationContext, Raj::class.java)
            startActivity(intent)
        }
        guj.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
        }
    }
}