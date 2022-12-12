package com.example.text_firebase

import android.content.Intent
import android.media.RemoteController
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        var user_chat = findViewById<EditText>(R.id.user_chat)
        var user_edit = findViewById<EditText>(R.id.user_edit)
        var user_next = findViewById<Button>(R.id.user_next)
        var chat_list = findViewById<ListView>(R.id.chat_list)



        user_next.setOnClickListener{
            if (user_edit.text.equals("") || user_chat.text.equals("")){
                return@setOnClickListener
            }
            var intent =  Intent(this, MainActivity::class.java)
            intent.putExtra("chatName", user_chat.text.toString())
            intent.putExtra("userName", user_edit.text.toString())
            startActivity(intent)
        }

    }
}