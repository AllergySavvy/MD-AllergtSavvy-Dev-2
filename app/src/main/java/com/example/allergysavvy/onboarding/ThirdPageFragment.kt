package com.example.allergysavvy.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.allergysavvy.R
import com.example.allergysavvy.databinding.FragmentThirdPageBinding
import com.example.allergysavvy.ui.welcome.WelcomeActivity

class ThirdPageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_third_page, container, false)
        return view
    }

}