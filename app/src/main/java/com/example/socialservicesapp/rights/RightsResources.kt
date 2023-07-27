package com.example.socialservicesapp.rights

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.R
import com.example.socialservicesapp.databinding.ActivityRightsResourcesBinding

private lateinit var binding: ActivityRightsResourcesBinding

class RightsResources : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRightsResourcesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}