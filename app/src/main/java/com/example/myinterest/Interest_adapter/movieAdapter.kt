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

class movieAdapter(
    private val context: Context?
): RecyclerView.Adapter<movieAdapter.movieViewHolder>(){
    class movieViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val movie_image : ImageView = view.findViewById(R.id.movie_image)
        val movie_name: TextView = view.findViewById(R.id.movie_name)
        val movie_producer: TextView = view.findViewById(R.id.movie_producer)
        val movie_comment: TextView = view.findViewById(R.id.movie_comment)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_movie, parent, false)
        return movieViewHolder(layout)
    }

    override fun onBindViewHolder(holder: movieViewHolder, position: Int) {
        val movie = interestData.movie[position]
        holder.movie_image.setImageResource(movie.movie_image)
        holder.movie_comment.text = movie.movie_comment
        holder.movie_name.text = movie.movie_name
        holder.movie_producer.text = movie.movie_director
    }

    override fun getItemCount(): Int {
        return interestData.movie.size
    }
}