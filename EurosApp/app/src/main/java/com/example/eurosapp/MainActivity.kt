            package com.example.eurosapp

            import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.eurosapp.databinding.ActivityMainBinding

            class MainActivity : AppCompatActivity() {

                private val binding by lazy {
                    ActivityMainBinding.inflate(layoutInflater)
                }

                override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)

                    setContentView(binding.root)

                    binding.buttonConverte.setOnClickListener{
                        //converter
                        var euros : Double = binding.editEuros.text.toString().toDouble()
                        //arredondar  e converter
                        var dolar : Double = String.format("%.2f",euros * 0.93).toDouble()
                        binding.textResultado.text = "$dolar $"

                    }
                }
            }