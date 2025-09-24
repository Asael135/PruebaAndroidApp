package com.example.app1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.app1.R




class EditarPerfilActivity : AppCompatActivity() {

    private lateinit var profileImage: ImageView
    private lateinit var btnCargarFoto: Button
    private lateinit var btnGuardar: Button
    private lateinit var etUsuario: EditText
    private lateinit var etCorreo: EditText
    private lateinit var etNombre: EditText
    private lateinit var etApellidos: EditText
    private lateinit var etTelefono: EditText
    private lateinit var etDireccion: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_perfil)

        // Inicializar vistas
        profileImage = findViewById(R.id.profileImage)
        btnCargarFoto = findViewById(R.id.btnCargarFoto)
        btnGuardar = findViewById(R.id.btnGuardar)
        etUsuario = findViewById(R.id.etUsuario)
        etCorreo = findViewById(R.id.etCorreo)
        etNombre = findViewById(R.id.etNombre)
        etApellidos = findViewById(R.id.etApellidos)
        etTelefono = findViewById(R.id.etTelefono)
        etDireccion = findViewById(R.id.etDireccion)

        // Listener para cargar foto
        btnCargarFoto.setOnClickListener {
            // TODO: abrir galería o cámara
        }

        // Listener para guardar datos
        btnGuardar.setOnClickListener {
            val usuario = etUsuario.text.toString()
            val correo = etCorreo.text.toString()
            val nombre = etNombre.text.toString()
            val apellidos = etApellidos.text.toString()
            val telefono = etTelefono.text.toString()
            val direccion = etDireccion.text.toString()

            // TODO: Guardar en BD o enviar a servidor
        }
    }
}
