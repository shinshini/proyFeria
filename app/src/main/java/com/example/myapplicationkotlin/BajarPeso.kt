package com.example.myapplicationkotlin

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplicationkotlin.bajarpeso.receta10b
import com.example.myapplicationkotlin.bajarpeso.receta1b
import com.example.myapplicationkotlin.bajarpeso.receta2b
import com.example.myapplicationkotlin.bajarpeso.receta3b
import com.example.myapplicationkotlin.bajarpeso.receta4b
import com.example.myapplicationkotlin.bajarpeso.receta5b
import com.example.myapplicationkotlin.bajarpeso.receta6b
import com.example.myapplicationkotlin.bajarpeso.receta7b
import com.example.myapplicationkotlin.bajarpeso.receta8b
import com.example.myapplicationkotlin.bajarpeso.receta9b

class BajarPeso : AppCompatActivity() {
    lateinit var btnbp1:CardView
    lateinit var btnbp2:CardView
    lateinit var btnbp3:CardView
    lateinit var btnbp4:CardView
    lateinit var btnbp5:CardView
    lateinit var btnbp6:CardView
    lateinit var btnbp7:CardView
    lateinit var btnbp8:CardView
    lateinit var btnbp9:CardView
    lateinit var btnbp10:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bajar_peso)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        cargarR();
        estadoBoton();
    }
    fun cargarR(){
        btnbp1=findViewById(R.id.btnReceta1b)
        btnbp2=findViewById(R.id.btnReceta2b)
        btnbp3=findViewById(R.id.btnReceta3b)
        btnbp4=findViewById(R.id.btnReceta4b)
        btnbp5=findViewById(R.id.btnReceta5b)
        btnbp6=findViewById(R.id.btnReceta6b)
        btnbp7=findViewById(R.id.btnReceta7b)
        btnbp8=findViewById(R.id.btnReceta8b)
        btnbp9=findViewById(R.id.btnReceta9b)
        btnbp10=findViewById(R.id.btnReceta10b)
    }

    fun estadoBoton(){
        btnbp1.setOnClickListener{
            val i = Intent(this,receta1b::class.java)
            startActivity(i)
        }
        btnbp2.setOnClickListener{
            val i = Intent(this,receta2b::class.java)
            startActivity(i)
        }
        btnbp3.setOnClickListener{
            val i = Intent(this,receta3b::class.java)
            startActivity(i)
        }
        btnbp4.setOnClickListener{
            val i = Intent(this,receta4b::class.java)
            startActivity(i)
        }
        btnbp5.setOnClickListener{
            val i = Intent(this,receta5b::class.java)
            startActivity(i)
        }
        btnbp6.setOnClickListener{
            val i = Intent(this,receta6b::class.java)
            startActivity(i)
        }
        btnbp7.setOnClickListener{
            val i = Intent(this,receta7b::class.java)
            startActivity(i)
        }
        btnbp8.setOnClickListener{
            val i = Intent(this,receta8b::class.java)
            startActivity(i)
        }
        btnbp9.setOnClickListener{
            val i = Intent(this,receta9b::class.java)
            startActivity(i)
        }
        btnbp10.setOnClickListener{
            val i = Intent(this,receta10b::class.java)
            startActivity(i)
        }
     }
}