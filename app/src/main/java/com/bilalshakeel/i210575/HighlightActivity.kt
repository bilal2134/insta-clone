package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.bilalshakeel.i210575.databinding.ActivityHighlightBinding

class HighlightActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHighlightBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHighlightBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListeners()
        setupSwipeGestures()
    }

    private fun setupClickListeners() {
        // Close button
        binding.closeButton.setOnClickListener {
            finish()
        }

        // Bottom toolbar buttons
        binding.activityButton.setOnClickListener {
            // Handle activity action
        }

        binding.createButton.setOnClickListener {
            // Handle create action
        }

        binding.createPostButton.setOnClickListener {
            // Handle create post action
        }

        binding.browseButton.setOnClickListener {
            // Handle browse action
        }

        binding.sendButton.setOnClickListener {
            // Handle send action
        }

        binding.moreButton.setOnClickListener {
            // Handle more action
        }
    }

    private fun setupSwipeGestures() {
        // Left swipe to go to next highlight
        // Right swipe to go to previous highlight
        // Tap to pause/resume
        binding.highlightImage.setOnClickListener {
            // Toggle play/pause
        }
    }
}