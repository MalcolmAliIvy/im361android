package com.malcolm.say

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.gms.maps.OnMapReadyCallback

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val myButton: Button = findViewById(R.id.start_button)
        myButton.setOnClickListener {
            val intent = Intent(this, FrenchActivity::class.java)
            startActivity(intent)
        }
    }
}