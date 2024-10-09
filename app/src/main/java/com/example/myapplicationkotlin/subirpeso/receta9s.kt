package com.example.myapplicationkotlin.subirpeso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplicationkotlin.R
import com.example.myapplicationkotlin.SubirPeso

class receta9s : AppCompatActivity() {
    lateinit var btnhome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_receta9s)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        cargarR()
        estadoButon()
    }
    fun cargarR() {
        btnhome=findViewById(R.id.btn_mas_recetas9S)
    }

    //estado button
    fun estadoButon() {
        btnhome.setOnClickListener {
            var aa = Intent(this, SubirPeso::class.java)
            startActivity(aa)
        }
    }
}