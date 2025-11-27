package com.example.competition2k25.dataclasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.competition2k25.R

class CampusFeedAdapter(private val posts: List<CampusFeed>) : RecyclerView.Adapter<CampusFeedAdapter.CampusFeedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CampusFeedViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.campus_feed_item, parent, false)
        return CampusFeedViewHolder(view)
    }

    override fun onBindViewHolder(holder: CampusFeedViewHolder, position: Int) {
        val post = posts[position]
        holder.bind(post)
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    class CampusFeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvUsername: TextView = itemView.findViewById(R.id.tvUsername)
        private val tvContent: TextView = itemView.findViewById(R.id.tvContent)
        private val tvTimePosted: TextView = itemView.findViewById(R.id.tvTimePosted)
        private val tvLikes: TextView = itemView.findViewById(R.id.tvLikes)
        private val tvComments: TextView = itemView.findViewById(R.id.tvComments)

        fun bind(post: CampusFeed) {
            tvUsername.text = post.username
            tvContent.text = post.content
            tvTimePosted.text = post.timePosted
            tvLikes.text = "Likes: ${post.likes}"
            tvComments.text = "Comments: ${post.comments}"
        }
    }
}