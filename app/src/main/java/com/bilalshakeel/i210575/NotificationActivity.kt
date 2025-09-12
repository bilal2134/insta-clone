package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView

class NotificationActivity : AppCompatActivity() {

    private lateinit var followingTab: TextView
    private lateinit var youTab: TextView
    private lateinit var followingUnderline: View
    private lateinit var youUnderline: View
    private lateinit var followingContent: NestedScrollView
    private lateinit var youContent: NestedScrollView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        setupViews()
        setupClickListeners()
        setupBottomNavigation()
        
        // Set status bar color
        window.statusBarColor = getColor(R.color.white)
    }

    private fun setupViews() {
        followingTab = findViewById(R.id.following_tab)
        youTab = findViewById(R.id.you_tab)
        followingUnderline = findViewById(R.id.following_underline)
        youUnderline = findViewById(R.id.you_underline)
        followingContent = findViewById(R.id.following_content)
        youContent = findViewById(R.id.you_content)
    }

    private fun setupClickListeners() {
        followingTab.setOnClickListener {
            showFollowingTab()
        }

        youTab.setOnClickListener {
            showYouTab()
        }
    }

    private fun setupBottomNavigation() {
        findViewById<LinearLayout>(R.id.home_nav).setOnClickListener {
            finish() // Go back to MainFeedActivity
        }

        findViewById<LinearLayout>(R.id.search_nav).setOnClickListener {
            val intent = Intent(this, DiscoverFeedActivity::class.java)
            startActivity(intent)
        }

        findViewById<LinearLayout>(R.id.add_nav).setOnClickListener {
            // Handle add post
        }

        findViewById<LinearLayout>(R.id.heart_nav).setOnClickListener {
            // Already on notification screen, do nothing
        }

        findViewById<LinearLayout>(R.id.profile_nav).setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showFollowingTab() {
        // Update tab styles
        followingTab.setTextColor(getColor(R.color.instagram_red))
        followingTab.setTypeface(null, android.graphics.Typeface.BOLD)
        youTab.setTextColor(getColor(R.color.text_gray))
        youTab.setTypeface(null, android.graphics.Typeface.NORMAL)

        // Update underlines
        followingUnderline.setBackgroundColor(getColor(R.color.instagram_red))
        youUnderline.setBackgroundColor(getColor(R.color.light_gray))

        // Show/hide content
        followingContent.visibility = View.VISIBLE
        youContent.visibility = View.GONE
    }

    private fun showYouTab() {
        // Update tab styles
        youTab.setTextColor(getColor(R.color.instagram_red))
        youTab.setTypeface(null, android.graphics.Typeface.BOLD)
        followingTab.setTextColor(getColor(R.color.text_gray))
        followingTab.setTypeface(null, android.graphics.Typeface.NORMAL)

        // Update underlines
        youUnderline.setBackgroundColor(getColor(R.color.instagram_red))
        followingUnderline.setBackgroundColor(getColor(R.color.light_gray))

        // Show/hide content
        youContent.visibility = View.VISIBLE
        followingContent.visibility = View.GONE
    }
}