package com.gaurneev.areaunitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.lang.NumberFormatException
import kotlin.math.sqrt

class pentagon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pentagon)

        val sideP1 : TextView = findViewById(R.id.etName1)
        val result : TextView = findViewById(R.id.ans)
        val calculate: Button = findViewById(R.id.btnCalc)

        val p1:Double

        calculate.setOnClickListener {
            try {
                val p1 = sideP1.text.toString().toDouble()

                val answer = (1.720477400588967*p1*p1).toString()
                result.text = answer.toString()
            }
            catch (e: NumberFormatException) {
                result.text = "Enter Correct Input"
            }
        }
    }
}