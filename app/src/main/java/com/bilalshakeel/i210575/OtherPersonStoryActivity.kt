package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
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
        
        // Navigate to user profile when username is clicked
        findViewById<TextView>(R.id.username_text).setOnClickListener {
            val intent = Intent(this, OtherPersonProfileActivity::class.java)
            startActivity(intent)
        }
    }
}