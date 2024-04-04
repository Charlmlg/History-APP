package com.example.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge).text
        val btnGenerateHistory = findViewById<Button>(R.id.btnGenerateHistory)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnGenerateHistory.setOnClickListener {
            val age = etAge.toString().toInt()


            if (age < 20 )
                tvResult.text = "Range of age is to young"
            else
       when(age){
           39 -> tvResult.text = "you are ${age.toString()} years old, which is the same age as Martin Luther" +
                   "king jr.Martin Luther king was a historical figure. "
           56 -> tvResult.text =  "you are ${age.toString()} years old, which is the same age as Martin Abraham Lincoln" +
                   "Abraham Lincoln was a historical figure. "
           67 -> tvResult.text =  "you are ${age.toString()} years old, which is the same age as George Washington" +
                   "George Washington was a historical figure. "
           32 -> tvResult.text =  "you are ${age.toString()} years old, which is the same age as Alexander the Great" +
                   "Alexander the Great was a historical figure. "
           95 -> tvResult.text =  "you are ${age.toString()} years old, which is the same age as Nelson Mandela" +
                   "Nelson Mandela was a historical figure. "
           51-> tvResult.text =  "you are ${age.toString()} years old, which is the same age as Napoleon " +
                   "Napoleon was a historical figure. "
           78 -> tvResult.text =  "you are ${age.toString()} years old, which is the same age as Mahatma gandhi" +
                   "Mahatma gandhi was a historical figure. "
           83 -> tvResult.text =  "you are ${age.toString()} years old, which is the same age as Thomas Jefferson" +
                   "Thomas Jefferson was a historical figure. "
           52 -> tvResult.text =  "you are ${age.toString()} years old, which is the same age as William Shakespeare" +
                   "William Shakespeare was a historical figure. "
           92 -> tvResult.text =  "you are ${age.toString()} years old, which is the same age as Rosa Parks" +
                   "Rosa Parks was a historical figure. "
           else -> tvResult.text = "There is no Historical figure known to be around ${age.toString()} years old."



       }
            btnClear.setOnClickListener {
                etAge.clear()

            }

        }
    }
}