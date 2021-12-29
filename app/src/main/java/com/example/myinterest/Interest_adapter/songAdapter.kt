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

class songAdapter(
   private val context: Context?
): RecyclerView.Adapter<songAdapter.songAdapterViewHolder>(){
    class songAdapterViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val song_image: ImageView = view.findViewById(R.id.song_image)
        val song_name: TextView = view.findViewById(R.id.song_name)
        val song_singer: TextView = view.findViewById(R.id.song_singer)
        val song_comment: TextView = view.findViewById(R.id.song_comment)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): songAdapter.songAdapterViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_song, parent, false)
        return songAdapterViewHolder(layout)
    }

    override fun onBindViewHolder(holder: songAdapterViewHolder, position: Int) {
        val song = interestData.songs[position]
        holder.song_image.setImageResource(song.song_image)
        holder.song_comment.text = song.comment
        holder.song_name.text = song.song_name
        holder.song_singer.text = song.singer
    }

    override fun getItemCount(): Int {
        return interestData.songs.size
    }
}