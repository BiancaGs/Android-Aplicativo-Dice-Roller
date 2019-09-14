package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener{
            rollDice()

        }
    }

    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)

//      Random Number
        var randomN = Random.nextInt(1,6)

//      Set the text
        resultText.text = randomN.toString()

        Toast.makeText( this, "Dice rolled!", Toast.LENGTH_SHORT).show()
    }
}
