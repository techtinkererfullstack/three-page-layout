package com.example.threepagelayout

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.threepagelayout.databinding.ActivityMainBinding
import com.example.threepagelayout.databinding.ActivityWelcomeScreenBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.beginBtn.setOnClickListener {
//            Toast.makeText(this, "Begin button Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MainActivity, WelcomeScreen::class.java))
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }




    }
}