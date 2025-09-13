package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CameraActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        // Close camera
        findViewById<ImageView>(R.id.close_camera_button).setOnClickListener {
            finish()
        }

        // Flash toggle
        findViewById<ImageView>(R.id.flash_toggle).setOnClickListener {
            // Toggle flash mode
        }

        // Camera switch (front/back)
        findViewById<ImageView>(R.id.camera_switch).setOnClickListener {
            // Switch between front and back camera
        }

        // Mode selections
        findViewById<TextView>(R.id.mode_type).setOnClickListener {
            // Handle TYPE mode
        }

        findViewById<TextView>(R.id.mode_live).setOnClickListener {
            // Handle LIVE mode
        }

        findViewById<TextView>(R.id.mode_normal).setOnClickListener {
            // Handle NORMAL mode (default selected)
        }

        findViewById<TextView>(R.id.mode_boomerang).setOnClickListener {
            // Handle BOOMERANG mode
        }

        findViewById<TextView>(R.id.mode_super).setOnClickListener {
            // Handle SUPER mode
        }

        // Gallery button
        findViewById<FrameLayout>(R.id.gallery_button).setOnClickListener {
            val intent = Intent(this, UploadPhotoActivity::class.java)
            startActivity(intent)
        }

        // Capture button
        findViewById<FrameLayout>(R.id.capture_button).setOnClickListener {
            // Handle photo capture
            // For now, navigate to story creation
            val intent = Intent(this, AddStoryActivity::class.java)
            startActivity(intent)
        }

        // Effects button
        findViewById<ImageView>(R.id.effects_button).setOnClickListener {
            // Handle effects selection
        }
    }
}