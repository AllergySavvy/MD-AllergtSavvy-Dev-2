package com.example.allergysavvy

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.allergysavvy.R
import com.example.allergysavvy.databinding.ActivityStartBinding
import com.example.allergysavvy.onboarding.FisrtPageFragment
import com.example.allergysavvy.onboarding.OnBoardingFragment
import com.example.allergysavvy.onboarding.SecondPageFragment
import com.example.allergysavvy.onboarding.ThirdPageFragment
import com.example.allergysavvy.ui.welcome.WelcomeActivity

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding

    val onBoardingFragment = OnBoardingFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        onBoarding()

        if(onBoardingIsFinished()){
            val intent = Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            finish()
        } else{
            onBoarding()
        }
    }

    private fun onBoarding(){
        fragmentDisplay(onBoardingFragment)
    }

    private fun fragmentDisplay(fragment: Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.start_frame, fragment)
        commit()
    }

    private fun onBoardingIsFinished(): Boolean{
        val sharedPreferences = this.getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPreferences.getBoolean("finished",false)
    }
}