package com.example.competition2k25.dataclasses

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.competition2k25.R

class EventAdapter(private val events: List<Event>) : RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.event_item, parent, false)
        return EventViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = events[position]
        holder.bind(event)
    }

    override fun getItemCount(): Int {
        return events.size
    }

    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val tvEventName: TextView = itemView.findViewById(R.id.tvEventName)
        private val tvEventDate: TextView = itemView.findViewById(R.id.tvEventDate)
        private val tvEventDescription: TextView = itemView.findViewById(R.id.tvEventDescription)
        private val tvEventLocation: TextView = itemView.findViewById(R.id.tvEventLocation)

        fun bind(event: Event) {
            tvEventName.text = event.name
            tvEventDate.text = event.date
            tvEventDescription.text = event.description
            tvEventLocation.text = event.location
        }
    }
}