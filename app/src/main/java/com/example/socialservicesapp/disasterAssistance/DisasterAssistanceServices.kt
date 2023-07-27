package com.example.socialservicesapp.disasterAssistance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.R
import com.example.socialservicesapp.databinding.ActivityDisasterAssistanceServicesBinding

private lateinit var binding: ActivityDisasterAssistanceServicesBinding

class DisasterAssistanceServices : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDisasterAssistanceServicesBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}