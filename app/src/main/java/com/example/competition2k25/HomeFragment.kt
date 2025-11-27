package com.example.competition2k25
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.competition2k25.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var btnProfile: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize the button by finding it in the view
        btnProfile = view.findViewById(R.id.btnProfile)

        // Set up a click listener for the button
        btnProfile.setOnClickListener {
            // Use Navigation Component to navigate to com.example.competition2k25.ProfileFragment
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }
    }
}