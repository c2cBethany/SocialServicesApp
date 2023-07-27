package com.example.socialservicesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialservicesapp.Health.HealthResources
import com.example.socialservicesapp.aging.AgingServices
import com.example.socialservicesapp.databinding.ActivityHomePageBinding
import com.example.socialservicesapp.disability.DisabilityServices
import com.example.socialservicesapp.disasterAssistance.DisasterAssistanceServices
import com.example.socialservicesapp.financial.FinancialResources
import com.example.socialservicesapp.food.FoodResources
import com.example.socialservicesapp.mentalhealth.MentalHealthAndAbuse
import com.example.socialservicesapp.rights.RightsResources
import com.example.socialservicesapp.safety.SafetyResources

private lateinit var binding:ActivityHomePageBinding

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.agingOption.setOnClickListener{
            val intent = Intent(this, AgingServices::class.java)
            startActivity(intent)

        }

        binding.disabilityOption.setOnClickListener {
            val intent = Intent(this, DisabilityServices::class.java)
            startActivity(intent)
        }

        binding.disasterOption.setOnClickListener {
            val intent = Intent(this, DisasterAssistanceServices::class.java)
            startActivity(intent)
        }

        binding.financialOption.setOnClickListener {
            val intent = Intent(this, FinancialResources::class.java)
            startActivity(intent)
        }

        binding.foodOption.setOnClickListener {
            val intent = Intent(this, FoodResources::class.java)
            startActivity(intent)
        }

        binding.healthOption.setOnClickListener {
            val intent = Intent(this, HealthResources::class.java)
            startActivity(intent)
        }

        binding.mentalHealthOption.setOnClickListener {
            val intent = Intent(this, MentalHealthAndAbuse::class.java)
            startActivity(intent)
        }

        binding.rightsOption.setOnClickListener {
            val intent = Intent(this, RightsResources::class.java)
            startActivity(intent)
        }

        binding.safetyOption.setOnClickListener {
            val intent = Intent(this, SafetyResources::class.java)
            startActivity(intent)
        }

    }

}