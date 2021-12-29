package com.example.myinterest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myinterest.R
import com.example.myinterest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binnding: ActivityMainBinding
    private lateinit var interestIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binnding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binnding.root)

        //set click listener for anime
        binnding.anime.setOnClickListener{
            goto_anime()
        }
        binnding.movie.setOnClickListener{
            goto_movie()
        }
        binnding.music.setOnClickListener{
            goto_music()
        }
    }

    private fun goto_music() {
        interestIntent = Intent(this, song::class.java)
        startActivity(interestIntent)
    }

    private fun goto_movie() {
        interestIntent = Intent(this, movie::class.java)
        startActivity(interestIntent)
    }

    private fun goto_anime() {
        interestIntent = Intent(this, anime::class.java)
        startActivity(interestIntent)
    }
}