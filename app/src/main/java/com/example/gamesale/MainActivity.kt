package com.example.gamesale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainButton = findViewById<Button>(R.id.button)
        mainButton.setOnClickListener {
            val intent = Intent(this, SteamLookUp::class.java)
            startActivity(intent)
        }
    }
}