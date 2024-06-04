package com.android.routemakers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.routemakers.databinding.ActivityMainBinding

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val intent2 = intent
        val prePromptIntent = Intent(this, PrePrompt::class.java)
        val mypageIntent = Intent(this, Mypage::class.java)
        setContentView(binding.root)

        binding.btnPrePrompts.setOnClickListener {
            startActivity(prePromptIntent)
        }
        binding.btnMy.setOnClickListener {
            startActivity(mypageIntent)
        }
    }
}