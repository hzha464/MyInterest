package com.example.myinterest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myinterest.Interest_adapter.animeAdapter
import com.example.myinterest.databinding.ActivityAnimeBinding

class anime : AppCompatActivity() {
    private lateinit var binding: ActivityAnimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.animeGrid.adapter = animeAdapter(
            applicationContext
        )

        binding.animeGrid.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}