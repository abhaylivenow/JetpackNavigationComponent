package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation

class LogInFragment : Fragment() {

    private lateinit var btnSignUpScreen: Button
    private lateinit var btnForgetPasswordScreen: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_log_in, container, false)
        btnSignUpScreen = view.findViewById(R.id.btn_signup_page)
        btnForgetPasswordScreen = view.findViewById(R.id.btn_forget_password)
        btnSignUpScreen.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_logInFragment_to_signUpFragment)
        }
        btnForgetPasswordScreen.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_logInFragment_to_forgetPasswordFragment )
        }
        return view
    }
}