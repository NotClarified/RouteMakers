package com.android.routemakers

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.routemakers.databinding.ActivityFindPasswordBinding

class FindPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFindPasswordBinding.inflate(layoutInflater)
        val intent1 = intent
        setContentView(binding.root)
        binding.btnFind.setOnClickListener {
            Toast.makeText(applicationContext,"비밀번호는 000입니다.", Toast.LENGTH_LONG).show()
        }
    }
}