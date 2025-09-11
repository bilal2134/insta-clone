package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class SignupActivity : AppCompatActivity() {
    
    private lateinit var profilePictureCard: CardView
    private lateinit var profilePicture: ImageView
    private lateinit var backArrow: ImageView
    private lateinit var createAccountCard: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Hide action bar
        supportActionBar?.hide()

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        profilePictureCard = findViewById(R.id.profile_picture_card)
        profilePicture = findViewById(R.id.profile_picture)
        backArrow = findViewById(R.id.back_arrow)
        createAccountCard = findViewById(R.id.create_account_card)
    }

    private fun setupClickListeners() {
        // Profile picture click to open gallery
        profilePictureCard.setOnClickListener {
            openGallery()
        }

        // Back arrow click
        backArrow.setOnClickListener {
            finish()
        }

        // Create account button click
        createAccountCard.setOnClickListener {
            // Navigate to QuickLoginActivity
            val intent = Intent(this, QuickLoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, GALLERY_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == GALLERY_REQUEST_CODE && resultCode == RESULT_OK) {
            data?.data?.let { uri ->
                profilePicture.setImageURI(uri)
            }
        }
    }

    companion object {
        private const val GALLERY_REQUEST_CODE = 1001
    }
}
