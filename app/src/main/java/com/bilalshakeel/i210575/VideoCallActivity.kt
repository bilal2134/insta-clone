package com.bilalshakeel.i210575

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import android.widget.TextView

class VideoCallActivity : AppCompatActivity() {

    private var callDurationInSeconds = 0
    private lateinit var callDurationTextView: TextView
    private val handler = Handler(Looper.getMainLooper())
    private lateinit var updateTimeRunnable: Runnable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_call)

        // Make it full screen
        window.statusBarColor = android.graphics.Color.TRANSPARENT
        
        setupViews()
        startCallTimer()
        setupClickListeners()
    }

    private fun setupViews() {
        callDurationTextView = findViewById(R.id.call_duration)
    }

    private fun startCallTimer() {
        // Start from 03:12 (192 seconds) as shown in the image
        callDurationInSeconds = 192
        
        updateTimeRunnable = object : Runnable {
            override fun run() {
                updateCallDuration()
                handler.postDelayed(this, 1000) // Update every second
            }
        }
        handler.post(updateTimeRunnable)
    }

    private fun updateCallDuration() {
        val minutes = callDurationInSeconds / 60
        val seconds = callDurationInSeconds % 60
        val timeString = String.format("%02d:%02d", minutes, seconds)
        callDurationTextView.text = timeString
        callDurationInSeconds++
    }

    private fun setupClickListeners() {
        // Hang up button
        findViewById<CardView>(R.id.hang_up_button).setOnClickListener {
            endCall()
        }

        // Menu button
        findViewById<CardView>(R.id.menu_button).setOnClickListener {
            // Handle menu options
        }

        // Speaker button
        findViewById<CardView>(R.id.speaker_button).setOnClickListener {
            // Handle speaker toggle
        }
    }

    private fun endCall() {
        handler.removeCallbacks(updateTimeRunnable)
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(updateTimeRunnable)
    }
}