package com.example.myinterest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myinterest.Interest_adapter.movieAdapter
import com.example.myinterest.Interest_adapter.songAdapter
import com.example.myinterest.databinding.ActivityMainBinding
import com.example.myinterest.databinding.ActivityMovieBinding
import com.example.myinterest.databinding.ActivitySongBinding

class song : AppCompatActivity() {
    private lateinit var binding: ActivitySongBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.songLinear.adapter = songAdapter(
            applicationContext
        )

        binding.songLinear.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}