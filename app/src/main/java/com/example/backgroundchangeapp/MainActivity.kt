package com.example.backgroundchangeapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    val colors = arrayOf(Color.RED,Color.BLUE,Color.CYAN,Color.WHITE,Color.GREEN,Color.GRAY,Color.YELLOW,Color.BLACK)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val main_view= findViewById<ConstraintLayout>(R.id.main_view)
        val button= findViewById<FloatingActionButton>(R.id.button)
        button.setOnClickListener {
            main_view.setBackgroundColor(colors[Random.nextInt(colors.size)])
        }
    }
}