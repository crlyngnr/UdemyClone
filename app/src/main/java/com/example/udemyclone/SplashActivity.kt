package com.example.udemyclone

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private val SPLASH_DISPLAY_LENGTH = 1000 // 3 saniye

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // 3 saniye sonra MainActivity'e yönlendirme işlemi
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Bu aktiviteyi kapat
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }
}