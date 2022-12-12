package com.example.text_firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        var chat_view = findViewById<EditText>(R.id.user_chat)
        var user_edit = findViewById<EditText>(R.id.user_edit)
        var user_next = findViewById<Button>(R.id.user_next)
        var chat_list = findViewById<ListView>(R.id.chat_list)
        var intetent =  Intent(this, MainActivity::class.java)

    }
}