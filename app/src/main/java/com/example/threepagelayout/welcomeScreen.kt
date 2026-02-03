package com.example.threepagelayout

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//import com.example.threepagelayout.databinding.ActivityMainBinding
import com.example.threepagelayout.databinding.ActivityWelcomeScreenBinding

class WelcomeScreen : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityWelcomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.headerDrawerBackBtn.setOnClickListener {
//            Toast.makeText(this, "Begin button Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@WelcomeScreen, MainActivity::class.java))
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        binding.signupBtn.setOnClickListener {
//            Toast.makeText(this, "Begin button Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@WelcomeScreen, SignUpPage::class.java))
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }


    }
}