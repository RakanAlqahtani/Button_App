package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
private  lateinit var clMain : ConstraintLayout
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
         clMain = findViewById(R.id.clMain)

        Snackbar.make(clMain, "Wellcome to my app" , Snackbar.LENGTH_LONG).show()


        myText.text = "$count"

        button.setOnClickListener{plus()}
        button2.setOnClickListener{mins()}
//        changeTextColore()
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.mi_say_hi -> {
                Snackbar.make(clMain, "Hello there!", Snackbar.LENGTH_SHORT).show()
                return true
            }
            R.id.mi_say_bye -> {
                Snackbar.make(clMain, "Goodbye", Snackbar.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
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