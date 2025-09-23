package com.example.app1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {  // Hereda de AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Conecta con el layout XML

        // Ejemplo: hacer que el botón muestre un Toast al presionar
        val myButton: Button = findViewById(R.id.btnAwesome)
        myButton.setOnClickListener {
            Toast.makeText(this, "¡Botón presionado! 😎", Toast.LENGTH_SHORT).show()
        }
    }
}
