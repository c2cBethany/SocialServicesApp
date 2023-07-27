package com.example.socialservicesapp.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.R
import com.example.socialservicesapp.databinding.ActivityFoodResourcesBinding

private lateinit var binding: ActivityFoodResourcesBinding

class FoodResources : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFoodResourcesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}