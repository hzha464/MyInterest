package com.example.myinterest.Interest_adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myinterest.R
import com.example.myinterest.interest_data.interestData

class animeAdapter(
    private val context: Context?
   ):RecyclerView.Adapter<animeAdapter.animeViewHolder>(){
       class animeViewHolder(private val view: View): RecyclerView.ViewHolder(view){
           val anime_image: ImageView = view.findViewById(R.id.anime_image)
           val anime_name: TextView = view.findViewById(R.id.anime_name)
           val anime_comment: TextView = view.findViewById(R.id.anime_comment)
           val anime_producer: TextView = view.findViewById(R.id.anime_producer)
       }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): animeViewHolder {

        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_anime, parent, false)
        return animeViewHolder(layout)
    }



    override fun onBindViewHolder(holder: animeViewHolder, position: Int) {
        val anime = interestData.animes[position]
        val resources = context?.resources
        holder.anime_image.setImageResource(anime.anime_image)
        holder.anime_name.text =anime.anime_name
        holder.anime_comment.text = anime.comment
        holder.anime_producer.text = anime.producer

    }

    override fun getItemCount(): Int {
        return interestData.animes.size
    }

}