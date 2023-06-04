package com.example.gamesale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SteamLookUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_steam_look_up)

        val SalesButton = findViewById<Button>(R.id.button2)
        SalesButton.setOnClickListener {
            val intent = Intent(this, SteamSalesTimes::class.java)
            startActivity(intent)
        }

    }

    private fun userinput(): String {
        val textView = findViewById<EditText>(R.id.textView112)
        var userText = textView.text.toString()
        textView.setText(userText)
        return userText
    }
}