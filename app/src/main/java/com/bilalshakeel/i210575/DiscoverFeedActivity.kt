package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class DiscoverFeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discover_feed)
        
        // Set status bar color to match the app theme
        window.statusBarColor = ContextCompat.getColor(this, R.color.light_gray)
        
        // Set up header interactions
        val qrCodeIcon = findViewById<ImageView>(R.id.qr_code_icon)
        
        // QR Code icon click
        qrCodeIcon.setOnClickListener {
            // TODO: Open QR code scanner functionality
        }
        
        // Set up bottom navigation
        val homeNav = findViewById<ImageView>(R.id.nav_home)
        val searchNav = findViewById<ImageView>(R.id.nav_search)
        val addNav = findViewById<ImageView>(R.id.nav_add)
        val heartNav = findViewById<ImageView>(R.id.nav_heart)
        val profileNav = findViewById<CardView>(R.id.nav_profile)
        
        // Home navigation - go back to main feed
        homeNav.setOnClickListener {
            val intent = Intent(this, MainFeedActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Search navigation - already here, so highlight it
        searchNav.setColorFilter(ContextCompat.getColor(this, R.color.instagram_red))
        
        // Add post navigation
        addNav.setOnClickListener {
            // TODO: Navigate to add post screen
        }
        
        // Heart/Activity navigation
        heartNav.setOnClickListener {
            // TODO: Navigate to activity screen
        }
        
        // Profile navigation
        profileNav.setOnClickListener {
            // TODO: Navigate to profile screen
        }
    }
}
