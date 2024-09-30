package com.example.myapplicationkotlin


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Locale


class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var checkBox: CheckBox
    private lateinit var btnRegister: MaterialButton
    private lateinit var etName: EditText
    private lateinit var etLastName: EditText
    private lateinit var etDateOfBirth: EditText
    private lateinit var etGoal: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        radioGroup = findViewById(R.id.radioGroup)
        checkBox = findViewById(R.id.checkBox)
        btnRegister = findViewById(R.id.btnRegister)
        etName = findViewById(R.id.etName)
        etLastName = findViewById(R.id.etLastName)
        etDateOfBirth = findViewById(R.id.etDateOfBirth)
        etGoal = findViewById(R.id.etGoal)
        // Listener para el botón de registrar
        btnRegister.setOnClickListener {
            registerUser()
        }
    }

    private fun registerUser() {
        // Obtener los valores de los campos de entrada
        val name = etName.text.toString()
        val lastName = etLastName.text.toString()
        val dateOfBirth = etDateOfBirth.text.toString()
        val goal = etGoal.text.toString()

        // Obtener el objetivo seleccionado del RadioGroup
        val selectedGoal = when (radioGroup.checkedRadioButtonId) {
            R.id.rbBajarPeso -> "Bajar de peso"
            R.id.rbSubirPeso -> "Subir de peso"
            R.id.rbMantenerPeso -> "Mantener peso"
            else -> null // Si no hay selección
        }

        // Verificar si todos los campos están llenos
        if (name.isBlank() || lastName.isBlank() || dateOfBirth.isBlank() || goal.isBlank() || selectedGoal == null) {
            Toast.makeText(this, "Por favor, completa todos los campos.", Toast.LENGTH_SHORT).show()
            return
        }

        // Validar la fecha de nacimiento
        if (!isValidDate(dateOfBirth)) {
            Toast.makeText(this, "Por favor, introduce una fecha válida (dd/MM/yyyy).", Toast.LENGTH_SHORT).show()
            return
        }

        // Manejo de la lógica de registro (puedes guardarlo en una base de datos, etc.)
        println("Nombre: $name")
        println("Apellido: $lastName")
        println("Fecha de Nacimiento: $dateOfBirth")
        println("Objetivo: $goal")
        println("Objetivo Seleccionado: $selectedGoal")
        println("¿Guardar sesión? ${checkBox.isChecked}")

        // Navegar a la actividad correspondiente según el objetivo seleccionado
        val intent = when (selectedGoal) {
            "Bajar de peso" -> Intent(this, BajarPeso::class.java)
            "Subir de peso" -> Intent(this, SubirPeso::class.java)
            "Mantener peso" -> Intent(this, MantenerPeso::class.java)
            else -> null
        }

        // Iniciar la actividad solo si el intent no es nulo
        intent?.let {
            startActivity(it)
        }
    }

    private fun isValidDate(date: String): Boolean {
        // Ejemplo de validación básica de fecha (dd/MM/yyyy)
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        dateFormat.isLenient = false
        return try {
            dateFormat.parse(date)
            true
        } catch (e: ParseException) {
            false
        }
    }

}