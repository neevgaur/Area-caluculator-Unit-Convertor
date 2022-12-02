package com.gaurneev.areaunitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.jvm.internal.Intrinsics

class areaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area)

        var t = findViewById<Button>(R.id.triangle)
        var r = findViewById<Button>(R.id.rectangles)
        var s = findViewById<Button>(R.id.square)
        var p = findViewById<Button>(R.id.pentagon)

        t.setOnClickListener{
            startActivity(Intent(this,triangle::class.java))
        }
        r.setOnClickListener{
            startActivity(Intent(this,rectangle::class.java))
        }
        s.setOnClickListener{
            startActivity(Intent(this,square::class.java))
        }
        p.setOnClickListener{
            startActivity(Intent(this,pentagon::class.java))
        }
    }
}