package com.malcolm.say

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class FrenchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_french)

        val myButton1: Button = findViewById(R.id.vocab_button)
        myButton1.setOnClickListener {
            val intent = Intent(this, VocabActivity::class.java)
            startActivity(intent)

        }


        val myButton2: Button = findViewById(R.id.card_button)
        myButton2.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            startActivity(intent)
        }


        val myButton3: Button = findViewById(R.id.quiz_button)
        myButton3.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)

        }

        val myButton4 : Button = findViewById(R.id.test_button)
        myButton4.setOnClickListener {
            val intent = Intent(this, TestActivity::class.java)
            startActivity(intent)
        }





        }
    }