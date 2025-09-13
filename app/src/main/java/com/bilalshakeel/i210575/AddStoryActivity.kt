package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class AddStoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_story)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        // Close add story
        findViewById<ImageView>(R.id.close_add_story_button).setOnClickListener {
            finish()
        }

        // Tool buttons
        findViewById<ImageView>(R.id.user_tagging_button).setOnClickListener {
            // Handle user tagging
        }

        findViewById<ImageView>(R.id.text_tool_button).setOnClickListener {
            // Handle text tool
        }

        findViewById<ImageView>(R.id.sticker_button).setOnClickListener {
            // Handle stickers
        }

        findViewById<ImageView>(R.id.music_button).setOnClickListener {
            // Handle music
        }

        findViewById<ImageView>(R.id.effects_add_button).setOnClickListener {
            // Handle effects
        }

        findViewById<ImageView>(R.id.more_tools_button).setOnClickListener {
            // Handle more tools
        }

        // Share options
        findViewById<LinearLayout>(R.id.your_stories_button).setOnClickListener {
            // Handle your stories sharing
        }

        findViewById<LinearLayout>(R.id.close_friends_button).setOnClickListener {
            // Handle close friends sharing
        }

        // Share story button (forward arrow)
        findViewById<ImageView>(R.id.share_story_button).setOnClickListener {
            val intent = Intent(this, MyStoryViewActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}