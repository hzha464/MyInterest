package com.example.myinterest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myinterest.Interest_adapter.animeAdapter
import com.example.myinterest.Interest_adapter.movieAdapter
import com.example.myinterest.databinding.ActivityAnimeBinding
import com.example.myinterest.databinding.ActivityMovieBinding

class movie : AppCompatActivity() {
    private lateinit var binding: ActivityMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.movieLinear.adapter = movieAdapter(
            applicationContext
        )

        binding.movieLinear.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}