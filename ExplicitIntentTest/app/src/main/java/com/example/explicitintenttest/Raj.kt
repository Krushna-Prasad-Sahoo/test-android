package com.example.explicitintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Raj : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_raj)

        val puri = findViewById<Button>(R.id.puri)
        val dj = findViewById<Button>(R.id.dj)
        val guj = findViewById<Button>(R.id.guj)

        puri.setOnClickListener {
            intent = Intent(applicationContext, Puri::class.java)
            startActivity(intent)
        }
        dj.setOnClickListener {
            intent = Intent(applicationContext, DJ::class.java)
            startActivity(intent)
        }
        guj.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

    }
}