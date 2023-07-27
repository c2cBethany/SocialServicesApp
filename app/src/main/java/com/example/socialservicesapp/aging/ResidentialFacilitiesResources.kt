package com.example.socialservicesapp.aging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.databinding.ActivityAgingResourcesBinding

private lateinit var binding: ActivityAgingResourcesBinding

class ResidentialFacilitiesResources : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgingResourcesBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}