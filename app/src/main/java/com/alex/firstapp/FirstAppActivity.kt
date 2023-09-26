package com.alex.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.alex.androidmaster.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        //enlazamos la vista del xml con el activity por medio del id especificando el tipo del componente
        val botonInicio = findViewById<AppCompatButton>(R.id.botonInicio)
        val textoInicio = findViewById<AppCompatEditText>(R.id.etName)

        botonInicio.setOnClickListener {
            val name = textoInicio.text.toString()
            if(name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }

    }
}