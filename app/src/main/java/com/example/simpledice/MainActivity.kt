package com.example.simpledice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var diceOneImage : ImageView
    lateinit var diceTwoImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceOneImage = findViewById(R.id.image_dice_1)
        diceTwoImage = findViewById(R.id.image_dice_2)
        val rollBtn = findViewById<Button>(R.id.button)

        rollBtn.setOnClickListener { roll() }
    }

    private fun roll() {
        val dice = Dice(6)

        val diceRoll = dice.roll()

        val drawableDice = when (diceRoll){
            1 -> R.drawable.dice_one
            2 -> R.drawable.dice_two
            3 -> R.drawable.dice_three
            4 -> R.drawable.dice_four
            5 -> R.drawable.dice_five
            else -> R.drawable.dice_six

        }
        diceOneImage.setImageResource(drawableDice)

            val diceTwo = Dice(6)
            val diceRollTwo = diceTwo.roll()

        val drawableDice1 = when (diceRollTwo){
            1 -> R.drawable.dice_one
            2 -> R.drawable.dice_two
            3 -> R.drawable.dice_three
            4 -> R.drawable.dice_four
            5 -> R.drawable.dice_five
            else -> R.drawable.dice_six

        }
        diceTwoImage.setImageResource(drawableDice1)

    }
}