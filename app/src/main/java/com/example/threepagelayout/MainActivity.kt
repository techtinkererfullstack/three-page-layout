package com.example.threepagelayout

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.threepagelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.beginBtn.setOnClickListener {
//            Toast.makeText(this, "Begin button Clicked", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, WelcomeScreenn::class.java)
            startActivity(intent)

        }


    }
}