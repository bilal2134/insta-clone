package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class MainFeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_feed)
        
        // Set status bar color to match the app theme
        window.statusBarColor = ContextCompat.getColor(this, R.color.light_gray)
        
        // Set up header interactions
        val cameraIcon = findViewById<ImageView>(R.id.camera_icon)
        val igtvIcon = findViewById<ImageView>(R.id.igtv_icon)
        val directMessageIcon = findViewById<ImageView>(R.id.direct_message_icon)
        
        // Camera icon click
        cameraIcon.setOnClickListener {
            // TODO: Open camera functionality
        }
        
        // IGTV icon click
        igtvIcon.setOnClickListener {
            // TODO: Open IGTV screen
        }
        
        // Direct Message icon click
        directMessageIcon.setOnClickListener {
            val intent = Intent(this, InboxActivity::class.java)
            startActivity(intent)
        }
        
        // Set up post interactions
        val likeIcon = findViewById<ImageView>(R.id.like_button)
        val commentIcon = findViewById<ImageView>(R.id.comment_button)
        val sharePostIcon = findViewById<ImageView>(R.id.share_post_button)
        val bookmarkIcon = findViewById<ImageView>(R.id.bookmark_button)
        
        var isLiked = false
        var isSaved = false
        
        // Like button functionality
        likeIcon.setOnClickListener {
            if (isLiked) {
                likeIcon.setColorFilter(ContextCompat.getColor(this, android.R.color.black))
                isLiked = false
            } else {
                likeIcon.setColorFilter(ContextCompat.getColor(this, R.color.instagram_red))
                isLiked = true
            }
        }
        
        // Comment icon click
        commentIcon.setOnClickListener {
            // TODO: Open comments screen
        }
        
        // Share post icon click
        sharePostIcon.setOnClickListener {
            // TODO: Open share post functionality
        }
        
        // Bookmark functionality
        bookmarkIcon.setOnClickListener {
            if (isSaved) {
                bookmarkIcon.setColorFilter(ContextCompat.getColor(this, android.R.color.black))
                isSaved = false
            } else {
                bookmarkIcon.setColorFilter(ContextCompat.getColor(this, R.color.dark_brown))
                isSaved = true
            }
        }
        
        // Set up bottom navigation
        val homeNav = findViewById<ImageView>(R.id.nav_home)
        val searchNav = findViewById<ImageView>(R.id.nav_search)
        val addNav = findViewById<ImageView>(R.id.nav_add)
        val heartNav = findViewById<ImageView>(R.id.nav_heart)
        val profileNav = findViewById<ImageView>(R.id.nav_profile)
        
        // Search navigation
        searchNav.setOnClickListener {
            val intent = Intent(this, DiscoverFeedActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Add post navigation
        addNav.setOnClickListener {
            val intent = Intent(this, UploadPhotoActivity::class.java)
            startActivity(intent)
        }
        
        // Heart/Activity navigation
        heartNav.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }
        
        // Profile navigation
        profileNav.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
