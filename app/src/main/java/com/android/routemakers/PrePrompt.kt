package com.android.routemakers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.routemakers.databinding.ActivityPrePromptBinding

class PrePrompt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPrePromptBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mapageIntent = Intent(this, Mypage::class.java)
        val mainIntent = Intent(this, Main::class.java)
        val intent3 = intent

        binding.btnMy.setOnClickListener {
            startActivity(mapageIntent)
            finish()
        }
        binding.btnTitle.setOnClickListener {
            startActivity(mainIntent)
            finish()
        }
    }
}