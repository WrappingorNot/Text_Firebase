package com.example.text_firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.text_firebase.databinding.ActivityBoardListBinding
import com.google.firebase.auth.FirebaseAuth

class BoardListActivity : AppCompatActivity() {

    private val TAG = BoardListActivity::class.java.simpleName

    private lateinit var auth : FirebaseAuth


    private lateinit var binding: ActivityBoardListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_list)
        binding = ActivityBoardListBinding.inflate(layoutInflater)
        val view = binding.root
        auth = FirebaseAuth.getInstance()

        setContentView(view)

        val intent = Intent(this, BoardInputActivity::class.java)
        intent.putExtra("uid", auth.currentUser?.uid)
        startActivity(intent)



    }
}