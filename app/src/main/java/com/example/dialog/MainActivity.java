package com.example.dialog;

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.dialog.R

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Llamar a la función para mostrar el diálogo de entrada
        showInputDialog()
        }

private fun showInputDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Input Dialog")

        // Crear dos EditText para la entrada de texto
        val input1 = EditText(this)
        val input2 = EditText(this)

        // Agregar EditText al diseño del diálogo
        builder.setView(input1)
        builder.setView(input2)

        // Configurar el botón positivo
        builder.setPositiveButton("OK") { _, _ ->
        val text1 = input1.text.toString()
        val text2 = input2.text.toString()

        // Haz algo con los textos ingresados
        // Por ejemplo, puedes imprimirlos en el Logcat
        println("Texto 1: $text1")
        println("Texto 2: $text2")
        }

        // Configurar el botón negativo
        builder.setNegativeButton("Cancel") { dialog, _ ->
        dialog.cancel()
        }

        // Mostrar el diálogo
        builder.show()
        }
        }
