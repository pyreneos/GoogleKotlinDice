package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Dice(val numSides: Int) {

            fun roll(): Int {
                return (1..numSides).random()
            }
        }
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val textview: TextView= findViewById(R.id.textView)
            val imageview: ImageView=findViewById(R.id.imageView)
            textview.text=Dice(6).roll().toString()
            imageview.contentDescription=textview.text
            when(textview.text){
                "1"-> imageview.setImageResource(R.drawable.dice_1)
                "2"-> imageview.setImageResource(R.drawable.dice_2)
                "3"-> imageview.setImageResource(R.drawable.dice_3)
                "4"-> imageview.setImageResource(R.drawable.dice_4)
                "5"-> imageview.setImageResource(R.drawable.dice_5)
                "6"-> imageview.setImageResource(R.drawable.dice_6)

            }

        }
    }
}

