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

                /*  if (nome == "" || snome =="") {
                    Toast.makeText(applicationContext, "DADOS INVALIDOS", Toast.LENGTH_SHORT ).show()
                }
                else {

                    binding.textResultadp.text = "ola " + nome + " " + snome + "!"
                }
                */
                if(nome.isEmpty() && snome.isEmpty())
                {
                    Toast.makeText(applicationContext, "nao inseriu dados", Toast.LENGTH_SHORT ).show()
                }
                if(nome.isEmpty())
                {
                    Toast.makeText(applicationContext, "nome nao inserido", Toast.LENGTH_SHORT ).show()
                }
                else if(snome.isEmpty())
                {
                    Toast.makeText(applicationContext, "sobrenome nao inserido", Toast.LENGTH_SHORT ).show()
                }
                else{{
                    binding.textResultadp.text = "ola " + nome + " " + snome + "!"
                }}


            }






        }

    }
