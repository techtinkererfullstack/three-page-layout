package com.example.threepagelayout

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.threepagelayout.databinding.ActivitySignUpPageBinding

class SignUpPage : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignUpPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.headerDrawerBackBtn.setOnClickListener {
//            Toast.makeText(this, "Begin button Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@SignUpPage, WelcomeScreenn::class.java))
        }

        binding.signupBtnSignupPage.setOnClickListener {
            startActivity(Intent(this@SignUpPage, TeachersScreen::class.java))

        }


    }
}