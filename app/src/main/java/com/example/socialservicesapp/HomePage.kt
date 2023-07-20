package com.example.socialservicesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.aging.AgingResources
import com.example.socialservicesapp.databinding.ActivityHomePageBinding

private lateinit var binding:ActivityHomePageBinding

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.agingOption.setOnClickListener{
            val intent = Intent(this, AgingResources::class.java)
            startActivity(intent)

        }

    }

}