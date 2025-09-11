package com.bilalshakeel.i210575

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        // Hide action bar
        supportActionBar?.hide()

        // Navigate to SignupActivity after 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3 seconds delay
    }
}
