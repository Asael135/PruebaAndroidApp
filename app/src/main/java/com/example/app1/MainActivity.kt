package com.example.app1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Conecta con el layout XML

        val myButton: Button = findViewById(R.id.btnAwesome)
        myButton.setOnClickListener {
            // 1. Mostrar Toast
            Toast.makeText(this, "¡Botón presionado!", Toast.LENGTH_SHORT).show()

            // 2. Reemplazar el contenedor con FirstFragment
            supportFragmentManager.commit {
                replace(R.id.fragmentContainer, FirstFragment())
                addToBackStack(null) // opcional, para poder regresar con el botón de back
            }
        }
    }
}
