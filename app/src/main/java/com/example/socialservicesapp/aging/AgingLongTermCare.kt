package com.example.socialservicesapp.aging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.R
import com.example.socialservicesapp.databinding.ActivityAgingLongTermCareBinding

private lateinit var binding: ActivityAgingLongTermCareBinding

class AgingLongTermCare : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgingLongTermCareBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}