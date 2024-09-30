package com.example.myapplicationkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.os.Handler
import android.content.Intent
import androidx.core.view.WindowInsetsCompat

class logoComienzo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logo_comienzo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Temporizador para la pantalla de inicio
        Handler().postDelayed({
            // Intent para pasar a la siguiente actividad
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 milisegundos = 3 segundos
    }

}