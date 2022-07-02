package com.example.mytask_1

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val editText3 = findViewById<EditText>(R.id.editText3)
        val editText4 = findViewById<EditText>(R.id.editText4)
        val textResult = findViewById<TextView>(R.id.textResult)

        button.setOnClickListener {
            val text1 = editText1.text
            val text2 = editText2.text.toString().toInt()//рост
            val text3 = editText3.text.toString().toDouble()//вес
            val text4 = editText4.text.toString().toInt()//возраст

            if (text1.length in 1..50 && text2 > 0 && text2 < 250 && text3 > 0.0 && text3 < 250.0 && text4 > 0 && text4 < 150) {
                val res = (((10 * text3) + (6.25 * text2) - (5 * text4)) * 1.27 + text1.length).toInt()
                val result = "Your daily calorie intake: $res"
                textResult.text = result

            } else {
                Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
                textResult.text = "Data entered incorrectly!"
            }
        }
    }
}
