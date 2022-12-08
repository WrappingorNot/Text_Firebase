package com.example.text_firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase

class BoardInputActivity : AppCompatActivity() {

    private val TAG = BoardInputActivity::class.java.simpleName

    private var uid:String? = ""
    var form_button = findViewById<Button>(R.id.form_button)
    var text_form = findViewById<EditText>(R.id.text_form)
    var context_text_form = findViewById<EditText>(R.id.context_text_form)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_input)

        if (intent.hasExtra(("uid"))){

            uid = intent.getStringExtra("uid")

        }



        form_button.setOnClickListener{

            val database = FirebaseDatabase.getInstance()
            val myRef = database.getReference()


            val dataInput = DataModel(

                text_form.text.toString(),
                context_text_form.text.toString()

            )

            myRef.child(uid.toString()).setValue(dataInput)
        }


    }
}