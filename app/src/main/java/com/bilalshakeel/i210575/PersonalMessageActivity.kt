package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PersonalMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_message)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        // Back button
        findViewById<android.widget.ImageView>(R.id.back_button).setOnClickListener {
            finish()
        }

        // Video call button
        findViewById<android.widget.ImageView>(R.id.video_call_button).setOnClickListener {
            val intent = Intent(this, VideoCallActivity::class.java)
            startActivity(intent)
        }

        // Info button
        findViewById<android.widget.ImageView>(R.id.info_button).setOnClickListener {
            // Handle info/profile view
        }

        // Message input buttons
        findViewById<android.widget.ImageView>(R.id.microphone_button).setOnClickListener {
            // Handle voice message
        }

        findViewById<android.widget.ImageView>(R.id.gallery_button).setOnClickListener {
            // Handle gallery selection
        }

        findViewById<android.widget.ImageView>(R.id.emoji_button).setOnClickListener {
            // Handle emoji picker
        }
    }
}