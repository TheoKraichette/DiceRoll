package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollFlips() }

        val rollButton2: Button = findViewById(R.id.roll_button2)
        rollButton2.setOnClickListener { rollSide() }

        val rollButton3: Button = findViewById(R.id.roll_button3)
        rollButton3.setOnClickListener { rollRota() }

        val rollButton4: Button = findViewById(R.id.roll_button4)
        rollButton4.setOnClickListener { rollStance() }

        val rollButton5: Button = findViewById(R.id.roll_button5)
        rollButton5.setOnClickListener { rollFull() }
    }

    private fun rollFlips() {

        val flips = arrayOf("KickFlip", "HeelFlip", "Kickflip", "HeelFlip", "Sk8Dice", "Sk8Dice")
        val randomFlips = flips.random();

        val resultFlips: TextView = findViewById(R.id.roll_button)
        resultFlips.text = randomFlips.toString()
    }

    private fun rollSide() {

        val side = arrayOf("BackSide", "Frontside", "BackSide", "Frontside", "Sk8Dice", "Sk8Dice")
        val randomSide = side.random();

        val resultSide: TextView = findViewById(R.id.roll_button2)
        resultSide.text = randomSide.toString()
    }

    private fun rollRota() {

        val rota = arrayOf("180°", "180°", "360°", "360°", "Sk8Dice", "Sk8Dice")
        val randomRota = rota.random();

        val resultRota: TextView = findViewById(R.id.roll_button3)
        resultRota.text = randomRota.toString()
    }

    private fun rollStance() {

        val stance = arrayOf("normal", "switch", "nollie", "fakie", "Sk8Dice", "Sk8Dice")
        val randomStance = stance.random();

        val resultStance: TextView = findViewById(R.id.roll_button4)
        resultStance.text = randomStance.toString()
    }

    private fun rollFull() {
        rollStance();
        rollSide();
        rollFlips();
        rollRota();
    }


}