package com.example.text_firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var  auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var joinButton = findViewById<Button>(R.id.joinButton)
        var email_form = findViewById<EditText>(R.id.email_form)
        var pass_form = findViewById<EditText>(R.id.password_form)

        auth = FirebaseAuth.getInstance()

        joinButton.setOnClickListener(){

        auth.createUserWithEmailAndPassword(email_form.text.toString(), pass_form.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {

                    Toast.makeText(baseContext, "Authenticaion Success", Toast.LENGTH_LONG).show()

                    var intent = Intent(this, BoardListActivity::class.java)
                    startActivity(intent)
                } else {

                    Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_LONG).show()
                }
            }

            }


    }
}