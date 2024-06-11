package com.example.allergysavvy.ui.allergyform

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.allergysavvy.MainActivity
import com.example.allergysavvy.R

class AllergyFormActivity : AppCompatActivity() {

    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_allergy_form)

        submitButton = findViewById(R.id.btn_form_page)
        submitButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}