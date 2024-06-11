package com.example.allergysavvy.onboarding

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.allergysavvy.R
import com.example.allergysavvy.ui.welcome.WelcomeActivity
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class OnBoardingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_on_boarding, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FisrtPageFragment(),
            SecondPageFragment(),
            ThirdPageFragment(),
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        val viewPager = view.findViewById<ViewPager2>(R.id.viewPager2)
        viewPager.adapter = adapter

        val dotsIndicator = view.findViewById<DotsIndicator>(R.id.dots_indicator)
        dotsIndicator.attachTo(viewPager)

        val btnNext = view.findViewById<Button>(R.id.btn_next)
        val skip = view.findViewById<TextView>(R.id.skip)

        btnNext.setOnClickListener {
            val currentItem = viewPager.currentItem
            if (currentItem < fragmentList.size - 1) {
                // Move to next page
                viewPager.currentItem = currentItem + 1
            } else {
                // Navigate to WelcomeActivity if it's the last page
                val intent = Intent(activity, WelcomeActivity::class.java)
                startActivity(intent)
            }
        }

        skip.setOnClickListener {
            val intent = Intent(activity, WelcomeActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}