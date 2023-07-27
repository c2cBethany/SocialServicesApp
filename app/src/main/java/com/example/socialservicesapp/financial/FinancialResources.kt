package com.example.socialservicesapp.financial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.R
import com.example.socialservicesapp.databinding.ActivityFinancialResourcesBinding

private lateinit var binding: ActivityFinancialResourcesBinding

class FinancialResources : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFinancialResourcesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}