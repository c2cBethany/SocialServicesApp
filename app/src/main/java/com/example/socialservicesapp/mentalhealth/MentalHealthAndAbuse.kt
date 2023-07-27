package com.example.socialservicesapp.mentalhealth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.R
import com.example.socialservicesapp.databinding.ActivityMentalHealthAndAbuseBinding

private lateinit var binding: ActivityMentalHealthAndAbuseBinding

class MentalHealthAndAbuse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMentalHealthAndAbuseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}