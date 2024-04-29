    package com.example.olaappsobrenome

    import android.os.Bundle
    import android.widget.Toast
    import androidx.appcompat.app.AppCompatActivity
    import com.example.olaappsobrenome.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {

        private val binding by lazy {
            ActivityMainBinding.inflate(layoutInflater)
        }

        override fun onCreate(savedInstanceState: Bundle?)
        {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)
            binding.buttonOla.setOnClickListener {
                var nome: String = binding.editNome.text.toString()
                var snome: String = binding.editSobrenome.text.toString()
                binding.textResultadp.text = "ola " +nome+" "+snome+"!"


                Toast.makeText(applicationContext, "ola ${ nome} ${snome}", Toast.LENGTH_SHORT ).show()
            }


        }

    }
