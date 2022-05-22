package com.eos_gnss.countdownlib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eos_gnss.countdownlib.databinding.ActivityMainBinding
import com.eos_gnss.countdownlive.TimerLive

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        TimerLive.create(30000, 1000).observe(this) {
            binding.title.text = it.toString()
        }
    }

}