package com.example.firstdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHigh= findViewById<Button>(R.id.btnHigh)
        val buttonLow= findViewById<Button>(R.id.btnLow)

        buttonHigh.setOnClickListener{
            Toast.makeText(applicationContext, "Keep the JOSH high!!!", Toast.LENGTH_LONG).show()
        }

        buttonLow.setOnClickListener{
            Toast.makeText(applicationContext, "Feeling Low ? Have good food + sleep well -> You will be Recharged!!! ", Toast.LENGTH_LONG).show()
        }
    }
}