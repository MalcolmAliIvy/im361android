package com.malcolm.say

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.google.android.gms.maps.OnMapReadyCallback

class CardVocabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardsvocab)

        val myButton: Button = findViewById(R.id.start_button)
        myButton.setOnClickListener {
            val intent = Intent(this, FrenchActivity::class.java)
            startActivity(intent)



    }
}
