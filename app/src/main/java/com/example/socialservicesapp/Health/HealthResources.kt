package com.example.socialservicesapp.Health

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.R
import com.example.socialservicesapp.databinding.ActivityHealthResourcesBinding

private lateinit var binding: ActivityHealthResourcesBinding

class HealthResources : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHealthResourcesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}