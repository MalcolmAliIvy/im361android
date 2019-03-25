package com.malcolm.say

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onMapReady(p0: GoogleMap?) {
        Log.i ("Say","Map is ready")
    }

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myText: TextView = findViewById(R.id.my_text_view)
        val myButton: Button = findViewById(R.id.my_button)
        myButton.setOnClickListener {
            counter += 1
            myText.text = resources.getQuantityString(R.plurals.was_clicked, counter, counter)
        }

        val mapFragment = supportFragmentManager.findFragmentById(R.id.my_map_view) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
}
