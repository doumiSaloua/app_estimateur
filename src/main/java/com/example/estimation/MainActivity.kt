package com.example.estimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.estimation.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


class MainActivity : AppCompatActivity() {
    override fun onCreate (savedInstanceState : Bundle ?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
