package com.example.text_firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var  auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()

        auth.createUserWithEmailAndPassword("abc@naver.com", "123123")
            .addOnCompleteListener(this){ task ->
                if(task.isSuccessful){

                    Toast.makeText(baseContext, "Authenticaion Success", Toast.LENGTH_LONG).show()
                }else{

                    Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_LONG).show()
                }

            }


    }
}