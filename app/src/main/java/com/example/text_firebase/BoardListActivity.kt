package com.example.text_firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class BoardListActivity : AppCompatActivity() {

    private val TAG = BoardListActivity::class.java.simpleName

    private lateinit var auth : FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_list)

        auth = FirebaseAuth.getInstance()



//        write_button.setOnClickListener{
//
//
//            val intent = Intent(this, BoardInputActivity::class.java)
//            intent.putExtra("uid", auth.currentUser?.uid)
//            startActivity(intent)
//
//        }


    }
}