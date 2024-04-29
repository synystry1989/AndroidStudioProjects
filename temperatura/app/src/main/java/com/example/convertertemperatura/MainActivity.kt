package com.example.convertertemperatura

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.convertertemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding  by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(binding.root)

        binding.buttonConvert.setOnClickListener {
            var celcius: Double = binding.editCelcius.text.toString().toDouble()
            var far : Double = String.format("%.2f",celcius * 1.8 + 32).toDouble()
            binding.textResultado.text = "obtem $far farenheit"
        }

    }40
}