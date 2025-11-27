package com.example.competition2k25.dataclasses

import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.competition2k25.R
class DiscussionThreadAdapter(private val threads: List<DiscussionThread>) : RecyclerView.Adapter<DiscussionThreadAdapter.DiscussionThreadViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiscussionThreadViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.discussion_thread_item, parent, false)
        return DiscussionThreadViewHolder(view)
    }

    override fun onBindViewHolder(holder: DiscussionThreadViewHolder, position: Int) {
        val thread = threads[position]
        holder.bind(thread)
    }

    override fun getItemCount(): Int {
        return threads.size
    }

    class DiscussionThreadViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvThreadTitle: TextView = itemView.findViewById(R.id.tvThreadTitle)
        private val tvThreadAuthor: TextView = itemView.findViewById(R.id.tvThreadAuthor)
        private val tvPostCount: TextView = itemView.findViewById(R.id.tvPostCount)

        fun bind(thread: DiscussionThread) {
            tvThreadTitle.text = thread.title
            tvThreadAuthor.text = thread.author
            tvPostCount.text = "Posts: ${thread.postCount}"
        }
    }
}