package com.bilalshakeel.i210575

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class InboxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inbox)
        
        // Set status bar color to match the app theme
        window.statusBarColor = ContextCompat.getColor(this, R.color.light_gray)
        
        // Set up header interactions
        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        val addMessageIcon = findViewById<ImageView>(R.id.add_message_icon)
        val searchBar = findViewById<CardView>(R.id.search_bar)
        
        // Back arrow click - go back to main feed
        backArrow.setOnClickListener {
            finish()
        }
        
        // Add message icon click
        addMessageIcon.setOnClickListener {
            // TODO: Open new message screen
        }
        
        // Search bar click
        searchBar.setOnClickListener {
            // TODO: Open message search screen
        }
    }
}