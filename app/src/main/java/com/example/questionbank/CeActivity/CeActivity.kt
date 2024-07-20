package com.example.questionbank.CeActivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.questionbank.R

class CeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ce)

        val button1st = findViewById<Button>(R.id.btn1ce)
        button1st.setOnClickListener {
            intent = Intent(this, Activity1stCe::class.java)
            startActivity(intent)

        }
        val button2nd = findViewById<Button>(R.id.btn2ce)
        button2nd.setOnClickListener {
            intent = Intent(this, Activity2ndCe::class.java)
            startActivity(intent)
        }
        val button3rd = findViewById<Button>(R.id.btn3ce)
        button3rd.setOnClickListener {
            intent = Intent(this, Activity3rdCe::class.java)
            startActivity(intent)
        }
        val button4th = findViewById<Button>(R.id.btn4ce)
        button4th.setOnClickListener {
            intent = Intent(this, Activity4thCe::class.java)
            startActivity(intent)
        }
        val button5th = findViewById<Button>(R.id.btn5ce)
        button5th.setOnClickListener {
            intent = Intent(this, Activity5thCe::class.java)
            startActivity(intent)
        }
        val button6th = findViewById<Button>(R.id.btn6ce)
        button6th.setOnClickListener {
            intent = Intent(this, Activity5thCe::class.java)
            startActivity(intent)
        }
        val button7th = findViewById<Button>(R.id.btn7ce)
        button7th.setOnClickListener {
            intent = Intent(this, Activity5thCe::class.java)
            startActivity(intent)
        }
        val button8th = findViewById<Button>(R.id.btn8ce)
        button8th.setOnClickListener {
            intent = Intent(this, Activity5thCe::class.java)
            startActivity(intent)
        }
    }
}