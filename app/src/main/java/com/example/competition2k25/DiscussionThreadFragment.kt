package com.example.competition2k25

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.competition2k25.databinding.FragmentCampusFeedBinding
import com.example.competition2k25.databinding.FragmentDiscussionThreadBinding
import com.example.competition2k25.databinding.FragmentEventListBinding
import com.example.competition2k25.dataclasses.CampusFeed
import com.example.competition2k25.dataclasses.CampusFeedAdapter
import com.example.competition2k25.dataclasses.DiscussionThread
import com.example.competition2k25.dataclasses.DiscussionThreadAdapter
import com.example.competition2k25.dataclasses.Event
import com.example.competition2k25.dataclasses.EventAdapter

class DiscussionThreadFragment : Fragment() {

    var _binding: FragmentDiscussionThreadBinding
    ? = null
    val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDiscussionThreadBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.recyclerViewThreadPosts?.layoutManager = LinearLayoutManager(context)
        binding?.recyclerViewThreadPosts?.adapter = DiscussionThreadAdapter(
            listOf(
                DiscussionThread("Our Application -- A breakdown", "Abdullah Attari", 4),
                DiscussionThread("Event Management -- A central point for discussion", "Abdullah Attari, Faizan", 8)
            )
        )
    }
}