package com.example.app1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import com.example.app1.R

class EditarPerfil : AppCompatActivity() {
    private var editTextValue1: String = ""
    private var editTextValue2: String = ""
    private var editTextValue3: String = ""
    private var editTextValue4: String = ""
    private var editTextValue5: String = ""
    private var editTextValue6: String = ""
    private var editTextValue7: String = ""
    private var editTextValue8: String = ""
    private var editTextValue9: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_perfil_two)

        // EditTexts
        val editText1: EditText = findViewById(R.id.rruq9tlw14d)
        editText1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue1 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val editText2: EditText = findViewById(R.id.rmgsalknznl)
        editText2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue2 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val editText3: EditText = findViewById(R.id.rtpres0vzfh)
        editText3.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue3 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val editText4: EditText = findViewById(R.id.rqym927w0zy)
        editText4.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue4 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val editText5: EditText = findViewById(R.id.rixdx5a66r6l)
        editText5.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue5 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val editText6: EditText = findViewById(R.id.rza2zi2lxjz8)
        editText6.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue6 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val editText7: EditText = findViewById(R.id.r52x8mt83m3j)
        editText7.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue7 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val editText8: EditText = findViewById(R.id.riqsjyf5jf4)
        editText8.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue8 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val editText9: EditText = findViewById(R.id.rhx0xf0braog)
        editText9.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                editTextValue9 = s.toString()
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        // Botón
        val button1: View = findViewById(R.id.r0biw8fqw3vcs)
        button1.setOnClickListener {
            println("Pressed")
        }
    }
}
