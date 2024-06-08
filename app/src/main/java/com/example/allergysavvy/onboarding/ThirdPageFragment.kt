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
    private var _binding : FragmentThirdPageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThirdPageBinding.inflate(inflater, container, false)
        val view : View = binding.root

        binding.btnThirdPage.setOnClickListener{
            val intent = Intent(activity, WelcomeActivity::class.java)
            activity?.startActivity(intent)
        }

        val skip = view.findViewById<TextView>(R.id.skip)
        skip.setOnClickListener {
            val intent = Intent(activity, WelcomeActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}