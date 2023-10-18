package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var textViewResultado = findViewById<TextView>(R.id.etext4)
        var textViewResultado2 = findViewById<TextView>(R.id.etext2)

        val weight = intent.extras?.getString("WEIGHT").orEmpty().toFloat()
        val height = intent.extras?.getString("HEIGHT").orEmpty().toFloat() / 100
        val imc = (weight) / (height * height)

        textViewResultado2.text=String.format("%.1f",imc)
        var state: String = ""

        when {
            imc < 18.5 -> {
                state = "Peso Bajo"
            }
            imc in 18.5..24.9 -> {
                state = "Peso Normal"
            }
            imc in 25.0..29.9 -> {
                state = "Sobrepeso"
            }
            imc in 30.0..34.9 -> {
                state = "Obesidad tipo I"
            }
            imc in 35.0..39.9 -> {
                state = "Obesidad tipo II"
            }
            imc >= 40.0 -> {
                state = "Obesidad tipo III"
            }
        }
        textViewResultado.text=state
    }}