package com.example.myinterest.interest_data

import com.example.myinterest.R
import com.example.myinterest.interestData_modle.anime
import com.example.myinterest.interestData_modle.movie
import com.example.myinterest.interestData_modle.song


object interestData {
    val animes: List<anime> = listOf(
        anime(
            R.drawable.blood_blockade_battlefront,
            "blood_blockade_battlefront",
            "",
            "bones"
        ),
        anime(
            R.drawable.cowboy_bebop,
            "cowboy_bebop",
            "",
            "sunrise"
        ),
        anime(
            R.drawable.flcl,
            "flcl",
            "",
            "FLCL Production Committee"
        ),
        anime(
            R.drawable.monogatari,
            "monogatari",
            "",
            "shaft"
        ),
        anime(
            R.drawable.one_piece,
            "one piece",
            "",
            "Toei Animation"
        ),
        anime(
            R.drawable.reborn_,
            "reborn!!",
            "",
            "Artland"
        )
    )
    val movie: List<movie> = listOf(
        movie(
            R.drawable.inception,
            "inception",
            "Christopher Nolan",
            ""
        ),
        movie(
            R.drawable.interstellar,
            "interstelllar",
            "Christopher Nolan",
            ""
        ),
        movie(
            R.drawable.kizumonogatari,
            "kizumonogatari",
            "Akiyuki Shinbo, Tatsuya Oishi",
            ""
        ),
        movie(
            R.drawable.my_neighbour_totoro,
            "my_neighbour_totoro",
            "Hayao Miyazaki",
            ""
        ),
        movie(
            R.drawable.sword_of_the_stranger,
            "sword_of_the_stranger",
            "Hayao Miyazaki",
            ""
        ),
        movie(
            R.drawable.the_wind_rises,
            "the_wind_rises",
            "Hayao Miyazaki",
            ""
        )
    )
    val songs: List<song> = listOf(
        song(
            R.drawable.acacia,
            "acacia",
        "BUMP OF CHICKEN",
        ""
        ),
        song(
            R.drawable.as_you_like_it,
            "as you like it",
            "eve",
            ""
        ),
        song(
            R.drawable.cry_bayby,
            "cry bayby",
            "Official髭男dism",
            ""
        ),
        song(
            R.drawable.lady,
            "lady",
            "Official髭男dism",
            ""
        ),
        song(
            R.drawable.moon___yoko_kanno,
            "moon",
            "Yoko Kanno",
            ""
        ),
        song(
            R.drawable.tracing_that_dream,
            "tracing that dream",
            "Ayase / YOASOBI",
            ""
        )
    )
}