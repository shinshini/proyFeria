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
import com.example.myapplicationkotlin.mantenerpeso.receta10m
import com.example.myapplicationkotlin.mantenerpeso.receta1m
import com.example.myapplicationkotlin.mantenerpeso.receta2m
import com.example.myapplicationkotlin.mantenerpeso.receta3m
import com.example.myapplicationkotlin.mantenerpeso.receta4m
import com.example.myapplicationkotlin.mantenerpeso.receta5m
import com.example.myapplicationkotlin.mantenerpeso.receta6m
import com.example.myapplicationkotlin.mantenerpeso.receta7m
import com.example.myapplicationkotlin.mantenerpeso.receta8m
import com.example.myapplicationkotlin.mantenerpeso.receta9m

class MantenerPeso : AppCompatActivity() {
    lateinit var btnmp1: CardView
    lateinit var btnmp2: CardView
    lateinit var btnmp3: CardView
    lateinit var btnmp4: CardView
    lateinit var btnmp5: CardView
    lateinit var btnmp6: CardView
    lateinit var btnmp7: CardView
    lateinit var btnmp8: CardView
    lateinit var btnmp9: CardView
    lateinit var btnmp10: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mantener_peso)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        cargarR()
        estadoBoton()
    }
    fun cargarR(){
        btnmp1=findViewById(R.id.btnReceta1m)
        btnmp2=findViewById(R.id.btnReceta2m)
        btnmp3=findViewById(R.id.btnReceta3m)
        btnmp4=findViewById(R.id.btnReceta4m)
        btnmp5=findViewById(R.id.btnReceta5m)
        btnmp6=findViewById(R.id.btnReceta6m)
        btnmp7=findViewById(R.id.btnReceta7m)
        btnmp8=findViewById(R.id.btnReceta8m)
        btnmp9=findViewById(R.id.btnReceta9m)
        btnmp10=findViewById(R.id.btnReceta10m)
    }
    fun estadoBoton(){
        btnmp1.setOnClickListener{
            val i = Intent(this, receta1m::class.java)
            startActivity(i)
        }
        btnmp2.setOnClickListener{
            val i = Intent(this, receta2m::class.java)
            startActivity(i)
        }
        btnmp3.setOnClickListener{
            val i = Intent(this, receta3m::class.java)
            startActivity(i)
        }
        btnmp4.setOnClickListener{
            val i = Intent(this, receta4m::class.java)
            startActivity(i)
        }
        btnmp5.setOnClickListener{
            val i = Intent(this, receta5m::class.java)
            startActivity(i)
        }
        btnmp6.setOnClickListener{
            val i = Intent(this, receta6m::class.java)
            startActivity(i)
        }
        btnmp7.setOnClickListener{
            val i = Intent(this, receta7m::class.java)
            startActivity(i)
        }
        btnmp8.setOnClickListener{
            val i = Intent(this, receta8m::class.java)
            startActivity(i)
        }
        btnmp9.setOnClickListener{
            val i = Intent(this, receta9m::class.java)
            startActivity(i)
        }
        btnmp10.setOnClickListener{
            val i = Intent(this, receta10m::class.java)
            startActivity(i)
        }
    }
}