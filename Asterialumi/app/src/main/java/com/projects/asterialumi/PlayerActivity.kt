package com.projects.asterialumi

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PlayerActivity : Activity() {
    //must override onCreate, others are optional
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player) //sets the layout that will be visible

        //functionality for enabling Service Component
        val buttonPlay = findViewById<Button>(R.id.button_play)
        buttonPlay.setOnClickListener {
            val intent = Intent(this, MusicService::class.java)
            startService(intent)
        }
    }
}