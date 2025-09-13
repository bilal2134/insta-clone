package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OtherPersonStoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_person_story)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        // Close story
        findViewById<ImageView>(R.id.close_story_button).setOnClickListener {
            finish()
        }

        // Send story to someone
        findViewById<ImageView>(R.id.send_story_button).setOnClickListener {
            // Handle send story action
        }

        // More options
        findViewById<ImageView>(R.id.more_story_button).setOnClickListener {
            // Handle more options
        }
    }
}