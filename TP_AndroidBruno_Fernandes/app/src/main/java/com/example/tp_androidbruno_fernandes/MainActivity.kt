package com.example.tp_androidbruno_fernandes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tp_androidbruno_fernandes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        }
    }
