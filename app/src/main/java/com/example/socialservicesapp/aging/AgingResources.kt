package com.example.socialservicesapp.aging

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.HomePage
import com.example.socialservicesapp.databinding.ActivityAgingResourcesBinding

private lateinit var binding: ActivityAgingResourcesBinding

class AgingResources : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityAgingResourcesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //longterm care
        binding.agingLongtermCare.setOnClickListener {
            val intent = Intent(this, AgingLongTermCare::class.java)
            startActivity(intent)
        }

        //living assisted facilities
        binding.agingLivingAssistedFacilities.setOnClickListener {
            val intent = Intent(this, ResidentialFacilitiesResources::class.java)
            startActivity(intent)
        }

        //find an office near you
        binding.findOffice.setOnClickListener {
            val queryURL: Uri = Uri.parse("https://resources.hhs.texas.gov/pages/find-services")
            val intent = Intent(Intent.ACTION_VIEW, queryURL)
            startActivity(intent)
        }

        binding.AgingBackButton.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

    }
}