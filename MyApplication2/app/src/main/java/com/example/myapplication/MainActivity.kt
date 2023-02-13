package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tipResultTextView: TextView = findViewById(R.id.tipResultTextView)

        val priceEditText: EditText = findViewById(R.id.priceEditText)
        val tipEditText: EditText = findViewById(R.id.tipPercentageEditText)

        val tip10Btn: Button = findViewById(R.id.tip10Button)
        val tip18Btn: Button = findViewById(R.id.tip18Button)
        val tip25Btn: Button = findViewById(R.id.tip25Button)
        val calculateButton: Button = findViewById(R.id.calculateButton)

        tip10Btn.setOnClickListener{
            tipEditText.setText("10")
        }
        tip18Btn.setOnClickListener{
            tipEditText.setText("18")
        }
        tip25Btn.setOnClickListener{
            tipEditText.setText("25")
        }

        calculateButton.setOnClickListener{
            try{
                val price:Double = priceEditText.text.toString().toDouble()
                val tipPercentage: Double = tipEditText.text.toString().toDouble()

                val result = price * tipPercentage / 100

                Toast.makeText(applicationContext,
                    text:"Calculation Success!", toast.LENGTH_LONG).show()
                tipResultTextView.text = "$${result}"

            } catch (ne:java.lang.NumberFormatException){
                Toast.makeText(applicationContext,
                    text:"Failed to calculate tips.", Toast.LENGTH_LONG).show()
                tipResultTextView.text = "Error"
            }

        }
    }


}