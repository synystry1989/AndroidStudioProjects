package com.example.ex1programacao5

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ex1programacao5.databinding.ActivityMain2Binding
import com.example.ex1programacao5.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.buttonBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
    }
}
