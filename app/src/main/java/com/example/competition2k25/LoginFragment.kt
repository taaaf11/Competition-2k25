package com.example.competition2k25

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.competition2k25.R
//import com.google.android.gms.cast.framework.SessionManager

class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        etEmail = view.findViewById(R.id.tilUsername)
        etPassword = view.findViewById(R.id.tilPassword)
        btnLogin = view.findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                loginUser(email, password)
            } else {
                Toast.makeText(context, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun loginUser(email: String, password: String) {
        // Simulate successful login (Firebase or backend logic can go here)
        // For simplicity, assume role is "Student"
        findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
    }
}