package com.example.gamesale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SteamSalesTimes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_steam_sales_times)

        val BackButton = findViewById<Button>(R.id.button3)
        BackButton.setOnClickListener {
            val intent = Intent(this, SteamLookUp::class.java)
            startActivity(intent)
        }
    }
}