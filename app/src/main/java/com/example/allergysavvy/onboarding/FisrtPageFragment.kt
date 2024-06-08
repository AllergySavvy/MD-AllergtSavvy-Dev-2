package com.example.allergysavvy.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.allergysavvy.R
import com.example.allergysavvy.ui.welcome.WelcomeActivity

class FisrtPageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fisrt_page, container, false)

        val next = view.findViewById<Button>(R.id.btn_first_page)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)

        next.setOnClickListener {
            viewPager?.currentItem = 1
        }

        val skip = view.findViewById<TextView>(R.id.skip)
        skip.setOnClickListener {
            val intent = Intent(activity, WelcomeActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}