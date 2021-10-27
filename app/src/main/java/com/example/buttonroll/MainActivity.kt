package com.example.buttonroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            RollButton.setOnClickListener(){
               // create a variable for storing the generated random number
                val randomInt = (1..6).random()
                //Declare a variable to reference to the textview to display the result
                val textResult: TextView = findViewById(R.id.Result)
                //Pass the random number to the created textview variable
                textResult.text = randomInt.toString()

        }
        CountButton.setOnClickListener(){

            val textResult: TextView = findViewById(R.id.Result)

            val stringVal = textResult.text.toString()

            var countResult: Int = stringVal.toInt()
            countResult++

            textResult.text = countResult.toString()


        }
        ResetButton.setOnClickListener(){
            val textResult: TextView = findViewById(R.id.Result)

            val stringVal = textResult.text.toString()

            var ZeroValue : Int = stringVal.toInt()

            ZeroValue = 0

            textResult.text = ZeroValue.toString()
        }




    }
}