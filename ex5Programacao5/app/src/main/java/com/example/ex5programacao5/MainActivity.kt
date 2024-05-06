package com.example.ex5programacao5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.ex5programacao5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.buttonConverter.setOnClickListener{

            var horasTotais: Int = binding.editTextHoras.text.toString().toInt()

            var semanas: Int
            var dias: Int
            var horas: Int

            //numero de horas semana - 168
            //numero de horas num dia -24

            semanas = horasTotais / 168

            dias = horasTotais/24 - (semanas*7)
            //estamos a retirar o valor de semanas que ja foi calculado mas convertendo para horas a (semana * 168) e o (dia *24 )
            horas = horasTotais - (semanas*168)- (dias*24)

            binding.textViewSemanas.text = "semanas: $semanas"
            binding.textViewDias.text = "dias: $dias"
            binding.textViewHoras.text = "horas: $horas"

        }




        }
    }
