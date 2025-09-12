package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.bilalshakeel.i210575.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListeners()
        loadUserData()
    }

    private fun setupClickListeners() {
        // Cancel button
        binding.cancelButton.setOnClickListener {
            finish()
        }

        // Done button
        binding.doneButton.setOnClickListener {
            saveChanges()
        }

        // Change photo button
        binding.changePhotoButton.setOnClickListener {
            // Handle photo change
            // You can implement photo picker here
        }

        // Professional account switch
        binding.switchProfessional.setOnClickListener {
            // Handle professional account switch
        }
    }

    private fun loadUserData() {
        // Load current user data into form fields
        // This would typically come from your user data storage
        binding.nameInput.setText("Jacob West")
        binding.usernameInput.setText("jacob_w")
        binding.websiteInput.setText("")
        binding.bioInput.setText("Digital goodies designer")
        binding.emailInput.setText("jacob.west@gmail.com")
        binding.phoneInput.setText("+1 202 555 0147")
        binding.genderInput.setText("Male")
    }

    private fun saveChanges() {
        // Get values from form fields
        val name = binding.nameInput.text.toString()
        val username = binding.usernameInput.text.toString()
        val website = binding.websiteInput.text.toString()
        val bio = binding.bioInput.text.toString()
        val email = binding.emailInput.text.toString()
        val phone = binding.phoneInput.text.toString()
        val gender = binding.genderInput.text.toString()

        // Save changes (implement your save logic here)
        // For now, just return to profile
        setResult(RESULT_OK)
        finish()
    }
}