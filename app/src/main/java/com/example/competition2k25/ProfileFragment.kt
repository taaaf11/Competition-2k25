package com.example.competition2k25

import android.view.View
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.competition2k25.R
import com.google.android.material.textfield.TextInputEditText

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var btnLogout: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnLogout = view.findViewById(R.id.btnLogout)

        btnLogout.setOnClickListener {
            // Implement logout functionality here
            Toast.makeText(context, "Logged Out", Toast.LENGTH_SHORT).show()
            // Optionally, navigate back to the Home or Login screen
            findNavController().navigate(R.id.action_profileFragment_to_homeFragment)
        }

        view.findViewById<Button>(R.id.btnLogout).setOnClickListener {
            findNavController().navigate(R.id.action_profileFragment_to_homeFragment)
        }
    }
}