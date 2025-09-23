package com.example.app1  // ajusta esto al nombre de tu paquete real

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView

class Login : AppCompatActivity() {

    private var editTextValue1: String = ""
    private var editTextValue2: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Si quieres, puedes dejar el ícono local que ya pusiste en el XML (mipmap/ic_launcher)
        val imageView: ImageView = findViewById(R.id.rgs5tjo234lb)
        imageView.setImageResource(R.mipmap.ic_launcher)  // o pon otra imagen de tus recursos

        val editText1: EditText = findViewById(R.id.rtc8hizm1oj)
        editText1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue1 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val editText2: EditText = findViewById(R.id.r9xyncwzvxew)
        editText2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue2 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val button1: View = findViewById(R.id.r5zgz8umxifp)
        button1.setOnClickListener {
            println("Entrar presionado con usuario=$editTextValue1 contraseña=$editTextValue2")
        }

        val button2: View = findViewById(R.id.rkaqwcixgzjp)
        button2.setOnClickListener {
            println("Crear cuenta presionado")
        }
    }
}
