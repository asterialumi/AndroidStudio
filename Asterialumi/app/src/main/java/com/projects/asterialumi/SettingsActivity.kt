package com.projects.asterialumi

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val buttonProfile = findViewById<Button>(R.id.button_profile)
        buttonProfile.setOnClickListener {
            Toast.makeText(
                this,
                "You clicked the button bro, good job",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}