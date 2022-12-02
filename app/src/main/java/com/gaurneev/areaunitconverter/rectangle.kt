package com.gaurneev.areaunitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.NumberFormatException
import kotlin.math.sqrt

class rectangle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        val sideR1 : TextView = findViewById(R.id.etName1)
        val sideR2 : TextView = findViewById(R.id.etName2)
        val result : TextView = findViewById(R.id.ans)
        val calculate: Button = findViewById(R.id.btnCalc)

        val len:Double
        val bre:Double

        calculate.setOnClickListener {
            try {
                val len = sideR1.text.toString().toDouble()
                val bre = sideR2.text.toString().toDouble()

                val answer = (len*bre).toString()
                result.text = answer.toString()
            }
            catch (e: NumberFormatException) {
                result.text = "Enter Correct Input"
            }
        }
    }
}