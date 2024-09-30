package com.example.myapplicationkotlin

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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
import com.example.myapplicationkotlin.subirpeso.receta10s
import com.example.myapplicationkotlin.subirpeso.receta1s
import com.example.myapplicationkotlin.subirpeso.receta2s
import com.example.myapplicationkotlin.subirpeso.receta3s
import com.example.myapplicationkotlin.subirpeso.receta4s
import com.example.myapplicationkotlin.subirpeso.receta5s
import com.example.myapplicationkotlin.subirpeso.receta6s
import com.example.myapplicationkotlin.subirpeso.receta7s
import com.example.myapplicationkotlin.subirpeso.receta8s
import com.example.myapplicationkotlin.subirpeso.receta9s

class SubirPeso : AppCompatActivity() {
    lateinit var btnsp1: CardView
    lateinit var btnsp2: CardView
    lateinit var btnsp3: CardView
    lateinit var btnsp4: CardView
    lateinit var btnsp5: CardView
    lateinit var btnsp6: CardView
    lateinit var btnsp7: CardView
    lateinit var btnsp8: CardView
    lateinit var btnsp9: CardView
    lateinit var btnsp10: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_subir_peso)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        cargarR();
        estadoBoton();
    }
    fun cargarR(){
        btnsp1=findViewById(R.id.btnReceta1s)
        btnsp2=findViewById(R.id.btnReceta2s)
        btnsp3=findViewById(R.id.btnReceta3s)
        btnsp4=findViewById(R.id.btnReceta4s)
        btnsp5=findViewById(R.id.btnReceta5s)
        btnsp6=findViewById(R.id.btnReceta6s)
        btnsp7=findViewById(R.id.btnReceta7s)
        btnsp8=findViewById(R.id.btnReceta8s)
        btnsp9=findViewById(R.id.btnReceta9s)
        btnsp10=findViewById(R.id.btnReceta10s)
    }
    fun estadoBoton(){
        btnsp1.setOnClickListener{
            val i = Intent(this, receta1s::class.java)
            startActivity(i)
        }
        btnsp2.setOnClickListener{
            val i = Intent(this, receta2s::class.java)
            startActivity(i)
        }
        btnsp3.setOnClickListener{
            val i = Intent(this, receta3s::class.java)
            startActivity(i)
        }
        btnsp4.setOnClickListener{
            val i = Intent(this, receta4s::class.java)
            startActivity(i)
        }
        btnsp5.setOnClickListener{
            val i = Intent(this, receta5s::class.java)
            startActivity(i)
        }
        btnsp6.setOnClickListener{
            val i = Intent(this, receta6s::class.java)
            startActivity(i)
        }
        btnsp7.setOnClickListener{
            val i = Intent(this, receta7s::class.java)
            startActivity(i)
        }
        btnsp8.setOnClickListener{
            val i = Intent(this, receta8s::class.java)
            startActivity(i)
        }
        btnsp9.setOnClickListener{
            val i = Intent(this, receta9s::class.java)
            startActivity(i)
        }
        btnsp10.setOnClickListener{
            val i = Intent(this, receta10s::class.java)
            startActivity(i)
        }
    }
}