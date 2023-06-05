package com.example.gamesale

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SteamLookUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_steam_look_up)

        val SalesButton = findViewById<Button>(R.id.button2)
        SalesButton.setOnClickListener {
            val intent = Intent(this, SteamSalesTimes::class.java)
            startActivity(intent)
        }
        val DisplayPrice = findViewById<TextView>(R.id.textView1)
        val SearchPrice = findViewById<Button>(R.id.button5)
        SearchPrice.setOnClickListener {
            when (userinput()) {
                "fallout4" -> DisplayPrice.setText("19.99")
                "skyrim" -> DisplayPrice.setText("39.99")
            }
        }

    }

    private fun userinput(): String {
        val textView = findViewById<EditText>(R.id.textView112)
        var userText = textView.text.toString()
        textView.setText(userText)
        return userText
    }
}