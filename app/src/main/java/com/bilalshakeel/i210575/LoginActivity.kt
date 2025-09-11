package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class LoginActivity : AppCompatActivity() {

    private lateinit var backArrowLogin: ImageView
    private lateinit var editUsernameLogin: EditText
    private lateinit var editPasswordLogin: EditText
    private lateinit var forgotPassword: TextView
    private lateinit var loginButtonMain: CardView
    private lateinit var signUpLinkLogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Hide action bar
        supportActionBar?.hide()

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        backArrowLogin = findViewById(R.id.back_arrow_login)
        editUsernameLogin = findViewById(R.id.edit_username_login)
        editPasswordLogin = findViewById(R.id.edit_password_login)
        forgotPassword = findViewById(R.id.forgot_password)
        loginButtonMain = findViewById(R.id.login_button_main)
        signUpLinkLogin = findViewById(R.id.sign_up_link_login)
    }

    private fun setupClickListeners() {
        // Back arrow click
        backArrowLogin.setOnClickListener {
            finish()
        }

        // Login button click
        loginButtonMain.setOnClickListener {
            // For now, just finish the activity
            // In future, this will navigate to the main feed
            finish()
        }

        // Forgot password click
        forgotPassword.setOnClickListener {
            // For now, just show a simple action
            // In future, this will open forgot password screen
        }

        // Sign up link click - go to signup
        signUpLinkLogin.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}
