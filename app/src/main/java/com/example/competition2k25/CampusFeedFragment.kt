package com.example.competition2k25

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.competition2k25.databinding.FragmentCampusFeedBinding
import com.example.competition2k25.databinding.FragmentEventListBinding
import com.example.competition2k25.dataclasses.CampusFeed
import com.example.competition2k25.dataclasses.CampusFeedAdapter
import com.example.competition2k25.dataclasses.Event
import com.example.competition2k25.dataclasses.EventAdapter

class CampusFeedFragment : Fragment() {

    var _binding: FragmentCampusFeedBinding
    ? = null
    val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCampusFeedBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.recyclerViewFeed?.layoutManager = LinearLayoutManager(context)
        binding?.recyclerViewFeed?.adapter = CampusFeedAdapter(
            listOf(
                CampusFeed("Abdullah Attari", "We have won the techfest App!!!!", "Today", 1000000, 200),
                CampusFeed("Altaaf", "We have won the techfest App!!!!", "Today", 1000000, 200),
                CampusFeed("Fahad", "We have won the techfest App!!!!", "Today", 1000000, 200),

                CampusFeed("Mohid", "We have won the techfest App!!!!", "Today", 1000000, 200),
            )
        )
    }
}