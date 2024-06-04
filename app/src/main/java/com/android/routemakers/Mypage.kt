package com.android.routemakers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.routemakers.databinding.ActivityMypageBinding

class Mypage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMypageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val mainIntent = Intent(this, Main::class.java)
        val intent4 = intent

        binding.btnTitle.setOnClickListener {
            startActivity(mainIntent)
            finish()
        }
    }
}