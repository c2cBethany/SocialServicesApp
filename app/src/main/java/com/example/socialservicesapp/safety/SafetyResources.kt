package com.example.socialservicesapp.safety

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.R
import com.example.socialservicesapp.databinding.ActivitySafetyResourcesBinding

private lateinit var binding: ActivitySafetyResourcesBinding

class SafetyResources : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySafetyResourcesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}