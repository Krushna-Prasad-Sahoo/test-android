package com.example.colourchangingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintSet.Layout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRed= findViewById<Button>(R.id.btnRed)
        val buttonGreen= findViewById<Button>(R.id.btnGreen)
        val layOut= findViewById<LinearLayout>(R.id.linLayout)

        buttonRed.setOnClickListener{
            // background color change to red
            layOut.setBackgroundResource(R.color.red)
        }

        buttonGreen.setOnClickListener{
            // background color change to green
            layOut.setBackgroundResource(R.color.green)
        }
    }
}