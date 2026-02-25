package com.projects.asterialumi

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MusicService : Service() {
    //Service does not bind, therefore it returns null
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Music is playing...", Toast.LENGTH_SHORT).show()
        //actual code for playing music, left blank for now
        return START_STICKY
    }

}