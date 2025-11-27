package com.example.competition2k25

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.competition2k25.databinding.FragmentEventListBinding
import com.example.competition2k25.dataclasses.Event
import com.example.competition2k25.dataclasses.EventAdapter

class EventListFragment : Fragment() {

    var _binding: FragmentEventListBinding? = null
    val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =FragmentEventListBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.recyclerViewEvents?.layoutManager = LinearLayoutManager(context)
        binding?.recyclerViewEvents?.adapter = EventAdapter(
            listOf(
                Event("App Competition", "Today", "A competition", "LGU"),
            )
        )
    }
}