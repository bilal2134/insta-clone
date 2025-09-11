package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class QuickLoginActivity : AppCompatActivity() {

    private lateinit var loginButtonQuick: CardView
    private lateinit var switchAccounts: TextView
    private lateinit var signUpLinkQuick: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quick_login)

        // Hide action bar
        supportActionBar?.hide()

        initViews()
        setupClickListeners()
    }

    private fun initViews() {
        loginButtonQuick = findViewById(R.id.login_button_quick)
        switchAccounts = findViewById(R.id.switch_accounts)
        signUpLinkQuick = findViewById(R.id.sign_up_link_quick)
    }

    private fun setupClickListeners() {
        // Log in button click - navigate to main login screen
        loginButtonQuick.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Switch accounts click
        switchAccounts.setOnClickListener {
            // For now, just show the same screen or go back to signup
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        // Sign up link click - go back to signup
        signUpLinkQuick.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}
