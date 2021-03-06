package com.malcolm.say

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_french)

        val myButton: Button = findViewById(R.id.start_button)
        myButton.setOnClickListener {
            val intent = Intent(this, FrenchActivity::class.java)
            startActivity(intent)

        }
    }
}