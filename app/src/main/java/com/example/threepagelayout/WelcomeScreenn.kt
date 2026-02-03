package com.example.threepagelayout

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.threepagelayout.databinding.ActivityWelcomeScreennBinding

class WelcomeScreenn : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeScreennBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityWelcomeScreennBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.headerDrawerBackBtn.setOnClickListener {
//            Toast.makeText(this, "Begin button Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@WelcomeScreenn, MainActivity::class.java))
        }

        binding.signupBtn.setOnClickListener {
//            Toast.makeText(this, "Begin button Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@WelcomeScreenn, SignUpPage::class.java))

        }
    }
}