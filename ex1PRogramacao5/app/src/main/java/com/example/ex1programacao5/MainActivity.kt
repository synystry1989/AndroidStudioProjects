package com.example.ex1programacao5

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ex1programacao5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonToast.setOnClickListener {

            Toast.makeText(applicationContext, "botao clicado", Toast.LENGTH_SHORT).show()
        }
        binding.buttonBemVindo.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))

        }


    }


}

