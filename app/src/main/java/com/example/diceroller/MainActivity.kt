package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
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

//      Random Number
        var randomN = Random.nextInt(1,6)

        val drawableResource = when(randomN){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val diceImage : ImageView = findViewById(R.id.dice_image)

        diceImage.setImageResource(drawableResource)

        Toast.makeText( this, "Dice rolled!", Toast.LENGTH_SHORT).show()
    }
}
