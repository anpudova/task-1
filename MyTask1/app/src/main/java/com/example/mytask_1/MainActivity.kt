package com.example.mytask_1

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Double

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
            val text2 = Integer.parseInt(editText2.text.toString())//рост
            val text3 = Double(editText3.text.toString())//вес
            val text4 = Integer.parseInt(editText4.text.toString())//возраст

            if (text1.length in 1..50 && text2 > 0 && text2 < 250 && text3 > 0.0 && text3 < 250.0 && text4 > 0 && text4 < 150) {
                val res = (((10 * text3.toDouble()) + (6.25 * text2) - (5 * text4)) * 1.27 + text1.length).toInt().toString()
                val result = "Your daily calorie intake: $res"
                textResult.setText(result).toString()

            } else {
                Toast.makeText(this, "Error", Toast.LENGTH_LONG).show()
                textResult.setText("Data entered incorrectly!").toString()
            }


    }

    }

}
