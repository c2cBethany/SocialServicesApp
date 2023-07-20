package com.example.socialservicesapp.aging

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.socialservicesapp.R
import com.example.socialservicesapp.databinding.ActivityAgingResourcesBinding

private lateinit var binding: ActivityAgingResourcesBinding

class AgingResources : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityAgingResourcesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.findAgingServices.setOnClickListener {
            val queryURL: Uri = Uri.parse("https://resources.hhs.texas.gov/pages/find-services")
            val intent = Intent(Intent.ACTION_VIEW, queryURL)
            startActivity(intent)
        }

        binding.careFromHomeButton.setOnClickListener {
            val fragment: Fragment? =
                supportFragmentManager.findFragmentByTag(CareFromHome_Fragment::class.java.simpleName)
            if (fragment !is CareFromHome_Fragment) {
                supportFragmentManager.beginTransaction()
                    .add(
                        R.id.LinearFragment_Container,
                        CareFromHome_Fragment(),
                        CareFromHome_Fragment::class.java.simpleName
                    )
                    .commit()
            }

            binding.careFromHomeButton.visibility = View.GONE
        }


    }
}