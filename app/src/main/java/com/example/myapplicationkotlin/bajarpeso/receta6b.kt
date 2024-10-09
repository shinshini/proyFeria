package com.example.myapplicationkotlin.bajarpeso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplicationkotlin.BajarPeso
import com.example.myapplicationkotlin.R

class receta6b : AppCompatActivity() {
    lateinit var btnhome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_receta6b)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        cargarR()
        estadoButon()
    }
    fun cargarR() {
        btnhome=findViewById(R.id.btn_mas_recetas6B)
    }

    //estado button
    fun estadoButon() {
        btnhome.setOnClickListener {
            var aa = Intent(this, BajarPeso::class.java)
            startActivity(aa)
        }
    }
}