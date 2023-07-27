package com.example.socialservicesapp.disability

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.R
import com.example.socialservicesapp.databinding.ActivityDisabilityServicesBinding

private lateinit var binding: ActivityDisabilityServicesBinding

class DisabilityServices : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDisabilityServicesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //find an office near you
        binding.findOffice.setOnClickListener {
            val queryURL: Uri = Uri.parse("https://resources.hhs.texas.gov/pages/find-services")
            val intent = Intent(Intent.ACTION_VIEW, queryURL)
            startActivity(intent)
        }


    }
}