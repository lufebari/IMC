package com.example.imc


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.SwitchCompat
import android.widget.Switch
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatDelegate



class IMC_Activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)



        val calcularButton = findViewById<View>(R.id.button)
        val weight=findViewById<EditText>(R.id.etext1)
        val height=findViewById<EditText>(R.id.etext2)


        calcularButton.setOnClickListener {
            // Crear un Intent para abrir la actividad "ResultadoActivity"
            if (weight.text.toString().isNotEmpty() and height.text.toString().isNotEmpty()) {
                val intent= Intent(this,Resultado::class.java)
                intent.putExtra("WEIGHT",weight.text.toString())
                intent.putExtra("HEIGHT",height.text.toString())
                startActivity(intent)




    }


        }
        // En el método onCreate de tu actividad
        val themeButton = findViewById<Switch>(R.id.switch1) // Reemplaza "Button" con el tipo de tu botón
        themeButton.setOnClickListener {
            val currentNightMode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
            val newNightMode = if (currentNightMode == Configuration.UI_MODE_NIGHT_NO) {
                AppCompatDelegate.MODE_NIGHT_YES // Cambiar al tema oscuro
            } else {
                AppCompatDelegate.MODE_NIGHT_NO // Cambiar al tema claro
            }
            AppCompatDelegate.setDefaultNightMode(newNightMode)
            recreate() // Recarga la actividad para aplicar el nuevo tema
        }


    }




}





