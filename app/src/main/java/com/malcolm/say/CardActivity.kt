package com.malcolm.say

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.google.android.gms.maps.OnMapReadyCallback

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        val myButton: Button = findViewById(R.id.pronoun_button)
        myButton.setOnClickListener {
            val intent = Intent(this, CardVocabActivity::class.java)
            startActivity(intent)
        }
    }
}