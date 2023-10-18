package com.example.imc

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.imc.IMC_Activity
import com.example.imc.R

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 1000 // 3 segundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            // Este método se ejecutará después del temporizador especificado
            val intent = Intent(this, IMC_Activity::class.java)
            startActivity(intent)

            // Cierra esta actividad
            finish()
        }, SPLASH_TIME_OUT)
    }
}