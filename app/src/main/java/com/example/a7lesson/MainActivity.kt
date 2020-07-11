package com.example.a7lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnTulip = findViewById <Button>(R.id.tulip)
        val btnRose=findViewById<Button>(R.id.rose)
        val btnCactus=findViewById<Button>(R.id.cactus)

        val tulip=Tulips()
        val rose=Rose()
        val cactus=Cactus()

        btnTulip.setOnClickListener(){
            tulip.makeGrow()
            Toast.makeText(applicationContext, "Растет тюльпан", Toast.LENGTH_LONG).show()
        }
        btnRose.setOnClickListener(){
            rose.makeGrow()
            Toast.makeText(applicationContext, "Растет роза", Toast.LENGTH_LONG).show()
        }
        btnCactus.setOnClickListener(){
            cactus.makeGrow()
            Toast.makeText(applicationContext, "Растет кактус", Toast.LENGTH_LONG).show()
        }


    }
}