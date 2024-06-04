package com.android.routemakers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.routemakers.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        val findPasswordIntent = Intent(this, FindPassword::class.java)
        val mainIntent = Intent(this, Main::class.java)
        setContentView(binding.root)

        binding.btnForgotPassword.setOnClickListener {
            startActivity(findPasswordIntent)
        }
        binding.btnLogin.setOnClickListener {
            startActivity(mainIntent)
        }
    }
}