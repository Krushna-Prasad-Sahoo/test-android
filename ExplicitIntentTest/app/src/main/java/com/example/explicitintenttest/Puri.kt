package com.example.explicitintenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Puri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puri2)

        val dj = findViewById<Button>(R.id.dj)
        val raj = findViewById<Button>(R.id.raj)
        val guj = findViewById<Button>(R.id.guj)


        dj.setOnClickListener {
            intent = Intent(applicationContext, DJ::class.java)
            startActivity(intent)
        }
        raj.setOnClickListener {
            intent = Intent(applicationContext, Raj::class.java)
            startActivity(intent)
        }
        guj.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}