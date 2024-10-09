package com.example.myapplicationkotlin.bajarpeso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplicationkotlin.BajarPeso
import com.example.myapplicationkotlin.MainActivity
import com.example.myapplicationkotlin.R

class receta1b : AppCompatActivity() {
    lateinit var btnhome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.receta1b)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        cargarR()
        estadoButon()
    }
    fun cargarR() {
        btnhome=findViewById(R.id.btn_mas_recetasB1)
    }

    //estado button
    fun estadoButon() {
        btnhome.setOnClickListener {
            var aa = Intent(this, BajarPeso::class.java)
            startActivity(aa)
        }
    }
}