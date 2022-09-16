package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnrequestguru = findViewById<Button>(R.id.buttonrequestguru)
        val btnrequest = findViewById<Button>(R.id.buttonrequest)

        btnrequestguru.setOnClickListener{
            val intent = Intent(this, profilguru::class.java)
            startActivity(intent)
        }
        btnrequest.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

    }
}