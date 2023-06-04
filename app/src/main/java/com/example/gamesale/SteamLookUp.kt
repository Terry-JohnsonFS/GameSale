package com.example.gamesale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class SteamLookUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_steam_look_up)
    }

    private fun userinput(): String {
        val textView = findViewById<EditText>(R.id.textView112)
        var userText = textView.text.toString()
        textView.setText(userText)
        return userText
    }
}