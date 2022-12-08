package com.example.text_firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth

class BoardInputActivity : AppCompatActivity() {

    private val TAG = BoardInputActivity::class.java.simpleName

    private var uid:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_input)

        if (intent.hasExtra(("uid"))){

            uid = intent.getStringExtra("uid")
        }


    }
}