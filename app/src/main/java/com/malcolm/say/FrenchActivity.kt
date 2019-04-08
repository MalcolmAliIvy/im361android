package com.malcolm.say

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.google.android.gms.maps.OnMapReadyCallback

class FrenchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_french)

        val myButton: Button = findViewById(R.id.vocab_button)
        myButton.setOnClickListener {
            val intent = Intent(this, VocabActivity::class.java)
            startActivity(intent)


            val myButton: Button = findViewById(R.id.card_button)
            myButton.setOnClickListener {
                val intent = Intent(this, CardActivity::class.java)
                startActivity(intent)


                val myButton: Button = findViewById(R.id.quiz_button)
                myButton.setOnClickListener {
                    val intent = Intent(this, QuizActivity::class.java)
                    startActivity(intent)


                    val myButton: Button = findViewById(R.id.test_button)
                    myButton.setOnClickListener {
                        val intent = Intent(this, TestActivity::class.java)
                        startActivity(intent)
                    }
                }
            }

          }

        }
    }