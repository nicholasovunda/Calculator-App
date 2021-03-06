package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
//import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var tvInput: TextView? = null
    var lastNumeric : Boolean =  false
    var lastDot : Boolean =  false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)
    }
    fun onDigit(view: View){
        tvInput?.append((view as Button).text)
        lastDot = false
        lastNumeric = true
    }
    fun onClear(view: View){
        tvInput?.text = ""
    }
    fun onDecimalPoint(view: View){
        if(lastNumeric && !lastDot){
        tvInput?.append(".")
        lastNumeric = false
        lastDot = true
        }
    }
    fun onOperator(view: View){
        tvInput?.text?.let{
            if(lastNumeric && !isOperatorAdded(it.toString())){
                tvInput?.append((view as Button).text)
                lastDot = false
                lastNumeric = false
            }
        }
    }
    fun onEqual(view : View){
        if(lastNumberic){
            var tvValue
        }
    }
    private fun isOperatorAdded(value : String) : Boolean{
        return if(value.startsWith("-")){
            false
        }else{
            (value.contains("-"))|| (value.contains("+"))|| (value.contains("*"))|| (value.contains("/"))
        }
    }
}