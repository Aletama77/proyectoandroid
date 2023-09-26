package com.alex.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.alex.androidmaster.R
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultado = findViewById<TextView>(R.id.textoResultado)
        //dame EXTRA_NAME si existe y sino damelo vacío
        val name:String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        resultado.text = "Hola $name"
    }
}