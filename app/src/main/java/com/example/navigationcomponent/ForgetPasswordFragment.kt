package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation

class ForgetPasswordFragment : Fragment() {

    private lateinit var btnSignUpScreen: Button
    private lateinit var btnLoginScreen: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_forget_password, container, false)
        btnSignUpScreen = view.findViewById(R.id.btn_signup_page)
        btnLoginScreen = view.findViewById(R.id.btn_login_page)
        btnSignUpScreen.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_forgetPasswordFragment_to_signUpFragment)
        }
        btnLoginScreen.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_forgetPasswordFragment_to_logInFragment)
        }
        return view
    }
}