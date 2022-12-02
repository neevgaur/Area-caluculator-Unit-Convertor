package com.gaurneev.areaunitconverter

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AlertDialog
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.cardview.widget.CardView
import org.w3c.dom.Text
import java.util.*

class converterActivity : AppCompatActivity() {
    var mCLayout: RelativeLayout? = null
    var values = arrayOf(
        "Inches",
        "Feet",
        "Kilometer",
        "Meter",
        "Centimeter"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_converter)
        var cv_fromUnit :CardView = findViewById(R.id.fromUnit)
        var cv_toUnit :CardView = findViewById(R.id.toUnit)
        var cv_convert :CardView = findViewById(R.id.cv_convert)
        mCLayout = findViewById(R.id.temp_relativeLayout)
        var text_fromUnit :TextView = findViewById(R.id.tv_fromUnit)
        var text_toUnit :TextView = findViewById(R.id.tv_toUnit)
        var et_fromunit :EditText = findViewById(R.id.et_fromUnit)
        var et_toUnit :EditText = findViewById(R.id.et_toUnit)

        cv_fromUnit.setOnClickListener {
            val popup = PopupMenu(this,cv_fromUnit)
            popup.inflate(R.menu.popup)
            popup.setOnMenuItemClickListener {
                text_fromUnit.text = it.title.toString()
                true
            }
            popup.show()
        }
        cv_toUnit.setOnClickListener {
            val popup = PopupMenu(this,cv_toUnit)
            popup.inflate(R.menu.popup)
            popup.setOnMenuItemClickListener {
                text_toUnit.text = it.title.toString()
                true
            }
            popup.show()
        }

        cv_convert.setOnClickListener {
            val tempInput = et_fromunit.getText().toString()
            if (tempInput == ""|| tempInput == null){
                et_fromunit.setError("Please Enter Some value")
            }
            else{
                if (text_fromUnit.getText().toString()==values[0])
                {
                    if (text_toUnit.getText().toString()==values[0]){
                        et_toUnit.setText(tempInput)
                    }
                    else if (text_toUnit.getText().toString()==values[1]){
                        et_toUnit.setText(inchesToFeet(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[2]){
                        et_toUnit.setText(inchesToKilometer(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[3]){
                        et_toUnit.setText(inchesToMeter(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[4]){
                        et_toUnit.setText(inchesToCentimeter(tempInput.toDouble()))
                    }
                }
                if (text_fromUnit.getText().toString()==values[1])
                {
                    if (text_toUnit.getText().toString()==values[1]){
                        et_toUnit.setText(tempInput)
                    }
                    else if (text_toUnit.getText().toString()==values[0]){
                        et_toUnit.setText(feetToInches(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[2]){
                        et_toUnit.setText(feetToKilometer(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[3]){
                        et_toUnit.setText(feetToMeter(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[4]){
                        et_toUnit.setText(feetToCentimeter(tempInput.toDouble()))
                    }
                }
                if (text_fromUnit.getText().toString()==values[2])
                {
                    if (text_toUnit.getText().toString()==values[2]){
                        et_toUnit.setText(tempInput)
                    }
                    else if (text_toUnit.getText().toString()==values[0]){
                        et_toUnit.setText(kilometerToInches(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[1]){
                        et_toUnit.setText(kilometerToFeet(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[3]){
                        et_toUnit.setText(kilometerToMeter(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[4]){
                        et_toUnit.setText(kilometerToCentimeter(tempInput.toDouble()))
                    }
                }
                if (text_fromUnit.getText().toString()==values[3])
                {
                    if (text_toUnit.getText().toString()==values[3]){
                        et_toUnit.setText(tempInput)
                    }
                    else if (text_toUnit.getText().toString()==values[0]){
                        et_toUnit.setText(meterToInches(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[1]){
                        et_toUnit.setText(meterToFeet(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[2]){
                        et_toUnit.setText(meterToKilometer(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[4]){
                        et_toUnit.setText(meterToCentimeter(tempInput.toDouble()))
                    }
                }
                if (text_fromUnit.getText().toString()==values[4])
                {
                    if (text_toUnit.getText().toString()==values[4]){
                        et_toUnit.setText(tempInput)
                    }
                    else if (text_toUnit.getText().toString()==values[0]){
                        et_toUnit.setText(CentimeterToInches(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[1]){
                        et_toUnit.setText(CentimeterToFeet(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[2]){
                        et_toUnit.setText(CentimeterToKilometer(tempInput.toDouble()))
                    }
                    else if (text_toUnit.getText().toString()==values[3]){
                        et_toUnit.setText(CentimeterTometer(tempInput.toDouble()))
                    }
                }
            }
        }
    }
    //Inches

    private fun inchesToFeet(inches: Double): String {
        val feet = inches * 0.0833
        return feet.toString()
    }

    private fun inchesToKilometer(inches: Double): String {
        val kilometer = inches / 39370.0787
        return kilometer.toString()
    }

    private fun inchesToMeter(inches: Double): String {
        val meter = inches / 39.3700787
        return meter.toString()
    }

    private fun inchesToCentimeter(inches: Double): String {
        val centimeter = inches / 0.393700787
        return centimeter.toString()
    }

    //Feet

    private fun feetToInches(feet: Double): String {
        val inches = feet *12
        return inches.toString()
    }

    private fun feetToKilometer(feet: Double): String {
        val kilometer = feet * 0.000305
        return kilometer.toString()
    }

    private fun feetToMeter(feet: Double): String {
        val meter = feet * 0.3048
        return meter.toString()
    }

    private fun feetToCentimeter(feet: Double): String {
        val centimeter = feet * 30.48
        return centimeter.toString()
    }

    //Kilometer

    private fun kilometerToInches(kilometer: Double): String {
        val inches = kilometer * 39370.08
        return inches.toString()
    }

    private fun kilometerToFeet(kilometer: Double): String {
        val Feet = kilometer * 3280.84
        return Feet.toString()
    }

    private fun kilometerToMeter(kilometer: Double): String {
        val meter = kilometer * 1000
        return meter.toString()
    }

    private fun kilometerToCentimeter(kilometer: Double): String {
        val centimeter = kilometer * 100000
        return centimeter.toString()
    }

    //meter

    private fun meterToInches(meter: Double): String {
        val inches = meter * 39.37008
        return inches.toString()
    }

    private fun meterToFeet(meter: Double): String {
        val Feet = meter * 3.28084
        return Feet.toString()
    }

    private fun meterToKilometer(meter: Double): String {
        val kilometer = meter / 1000
        return kilometer.toString()
    }

    private fun meterToCentimeter(meter: Double): String {
        val centimeter = meter * 100
        return centimeter.toString()
    }

    //Centimeter

    private fun CentimeterToInches(Centimeter: Double): String {
        val inches = Centimeter * 0.3937008
        return inches.toString()
    }

    private fun CentimeterToFeet(Centimeter: Double): String {
        val Feet = Centimeter * 0.0328084
        return Feet.toString()
    }

    private fun CentimeterToKilometer(Centimeter: Double): String {
        val kilometer = Centimeter / 100000
        return kilometer.toString()
    }

    private fun CentimeterTometer(Centimeter: Double): String {
        val meter = Centimeter / 100
        return meter.toString()
    }
}