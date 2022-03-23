package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class SignUpFragment : Fragment() {

    private lateinit var btnLoginScreen: Button
    private lateinit var btnForgetPasswordScreen: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_sign_up, container, false)
        btnLoginScreen = view.findViewById(R.id.btn_login_page)
        btnForgetPasswordScreen = view.findViewById(R.id.btn_forget_password)

        btnLoginScreen.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_signUpFragment_to_logInFragment)
        }

        btnForgetPasswordScreen.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_signUpFragment_to_forgetPasswordFragment)
        }
        return view
    }
}