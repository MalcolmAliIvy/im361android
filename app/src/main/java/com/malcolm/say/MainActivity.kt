package com.malcolm.say

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onMapReady(map: GoogleMap?) {
        val morton = LatLng(40.6091693, -89.5392298)
//        map?.addMarker(MarkerOptions().position(morton).title("Pumpkin capital of the world"))
//        map?.moveCamera(CameraUpdateFactory.newLatLng(morton))

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
