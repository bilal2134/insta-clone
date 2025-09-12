package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Set status bar color
        window.statusBarColor = ContextCompat.getColor(this, android.R.color.white)

        setupClickListeners()
        setupTabSwitching()
    }

    private fun setupClickListeners() {
        // Menu button
        findViewById<ImageView>(R.id.menu_button).setOnClickListener {
            // Handle menu options
        }

        // Edit Profile button
        findViewById<TextView>(R.id.edit_profile_button).setOnClickListener {
            // Handle edit profile
        }

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        findViewById<LinearLayout>(R.id.home_nav).setOnClickListener {
            val intent = Intent(this, MainFeedActivity::class.java)
            startActivity(intent)
            finish()
        }

        findViewById<LinearLayout>(R.id.search_nav).setOnClickListener {
            val intent = Intent(this, DiscoverFeedActivity::class.java)
            startActivity(intent)
        }

        findViewById<LinearLayout>(R.id.add_nav).setOnClickListener {
            // Handle add post
        }

        findViewById<LinearLayout>(R.id.heart_nav).setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        findViewById<LinearLayout>(R.id.profile_nav).setOnClickListener {
            // Already on profile screen, do nothing
        }
    }

    private fun setupTabSwitching() {
        val gridTab = findViewById<LinearLayout>(R.id.grid_tab)
        val taggedTab = findViewById<LinearLayout>(R.id.tagged_tab)

        gridTab.setOnClickListener {
            showGridTab()
        }

        taggedTab.setOnClickListener {
            showTaggedTab()
        }

        // Show grid tab by default
        showGridTab()
    }

    private fun showGridTab() {
        // Update grid tab (active)
        findViewById<ImageView>(R.id.grid_icon).setColorFilter(
            ContextCompat.getColor(this, R.color.instagram_red)
        )
        findViewById<android.view.View>(R.id.grid_underline).setBackgroundColor(
            ContextCompat.getColor(this, R.color.instagram_red)
        )

        // Update tagged tab (inactive)
        findViewById<ImageView>(R.id.tagged_icon).setColorFilter(
            ContextCompat.getColor(this, R.color.text_gray)
        )
        findViewById<android.view.View>(R.id.tagged_underline).setBackgroundColor(
            ContextCompat.getColor(this, R.color.light_gray)
        )
    }

    private fun showTaggedTab() {
        // Update tagged tab (active)
        findViewById<ImageView>(R.id.tagged_icon).setColorFilter(
            ContextCompat.getColor(this, R.color.instagram_red)
        )
        findViewById<android.view.View>(R.id.tagged_underline).setBackgroundColor(
            ContextCompat.getColor(this, R.color.instagram_red)
        )

        // Update grid tab (inactive)
        findViewById<ImageView>(R.id.grid_icon).setColorFilter(
            ContextCompat.getColor(this, R.color.text_gray)
        )
        findViewById<android.view.View>(R.id.grid_underline).setBackgroundColor(
            ContextCompat.getColor(this, R.color.light_gray)
        )
    }
}