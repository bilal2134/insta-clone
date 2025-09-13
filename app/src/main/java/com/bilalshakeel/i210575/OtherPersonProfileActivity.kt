package com.bilalshakeel.i210575

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OtherPersonProfileActivity : AppCompatActivity() {
    
    private lateinit var backButton: ImageView
    private lateinit var followButton: Button
    private lateinit var messageButton: Button
    private lateinit var emailButton: Button
    private lateinit var moreActionsButton: Button
    
    private var isFollowing = true // Default state from the screenshot
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_person_profile)
        
        initializeViews()
        setupClickListeners()
    }
    
    private fun initializeViews() {
        backButton = findViewById(R.id.back_button)
        followButton = findViewById(R.id.follow_button)
        messageButton = findViewById(R.id.message_button)
        emailButton = findViewById(R.id.email_button)
        moreActionsButton = findViewById(R.id.more_actions_button)
    }
    
    private fun setupClickListeners() {
        backButton.setOnClickListener {
            onBackPressed()
        }
        
        followButton.setOnClickListener {
            toggleFollowState()
        }
        
        messageButton.setOnClickListener {
            // Navigate to message activity or show message interface
            Toast.makeText(this, "Message clicked", Toast.LENGTH_SHORT).show()
        }
        
        emailButton.setOnClickListener {
            // Handle email action
            Toast.makeText(this, "Email clicked", Toast.LENGTH_SHORT).show()
        }
        
        moreActionsButton.setOnClickListener {
            // Show more actions menu
            Toast.makeText(this, "More actions", Toast.LENGTH_SHORT).show()
        }
    }
    
    private fun toggleFollowState() {
        isFollowing = !isFollowing
        updateFollowButton()
    }
    
    private fun updateFollowButton() {
        if (isFollowing) {
            followButton.text = "Following"
            followButton.setTextColor(getColor(R.color.white))
            followButton.setBackgroundResource(R.drawable.follow_button_active)
        } else {
            followButton.text = "Follow"
            followButton.setTextColor(getColor(R.color.white))
            followButton.setBackgroundResource(R.drawable.follow_button_inactive)
        }
    }
    
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}