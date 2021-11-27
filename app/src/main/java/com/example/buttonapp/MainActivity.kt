package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var myText : TextView
lateinit var button : Button
    lateinit var button2 : Button
     var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         myText = findViewById(R.id.tvMainText)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)


        myText.text = "$count"

        button.setOnClickListener{plus()}
        button2.setOnClickListener{mins()}
//        changeTextColore()
    }

    fun plus(){

        count++
        myText.text = "$count"
        if (count < 0){

            myText.setTextColor(Color.parseColor("#FF0000"))
        }
        else if (count == 0){
            myText.setTextColor(Color.parseColor("#010203"))
        }
        else{
            myText.setTextColor(Color.parseColor("#4CAF50"))

        }


    }
    fun mins(){

        count--
        myText.text = "$count"

        if (count < 0){
            myText.setTextColor(Color.parseColor("#FF0000"))
        }
        else if (count == 0){
            myText.setTextColor(Color.parseColor("#010203"))
        }
        else{
            myText.setTextColor(Color.parseColor("#4CAF50"))

        }

    }

    fun changeTextColore(){

        if (count >= 3){
            myText.setTextColor(Color.parseColor("#FF0000"))


        }
    }
}