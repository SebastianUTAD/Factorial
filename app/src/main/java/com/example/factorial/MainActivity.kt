package com.example.factorial

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculatefactorial(view: View){
        val editTextFactorial: EditText = findViewById(R.id.editTextFactorial)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        val number = editTextFactorial.text.toString().toInt()
        var factorial:Long = 1
        GlobalScope.launch {
            for (i in 1..number) {
                factorial *= i.toLong()
                textViewResult.text = "Result: ${factorial.toString()}"
                // Determina el tiempo de espera entre operacion
                delay(2000)
            }
        }
    }

}