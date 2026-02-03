package com.example.threepagelayout

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.threepagelayout.databinding.ActivityFrindsPageBinding
import com.example.threepagelayout.databinding.ActivitySignUpPageBinding

class TeachersScreen : AppCompatActivity() {
    private lateinit var binding: ActivityFrindsPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFrindsPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.headerDrawerBackBtn.setOnClickListener {
//            Toast.makeText(this, "Begin button Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@TeachersScreen, SignUpPage::class.java))
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

    }
}