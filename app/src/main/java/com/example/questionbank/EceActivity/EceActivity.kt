package com.example.questionbank.EceActivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.questionbank.R

class EceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ece)

        val button1st = findViewById<Button>(R.id.btn1ece)
        button1st.setOnClickListener {
            intent = Intent(this, Activity1stEce::class.java)
            startActivity(intent)

        }
        val button2nd = findViewById<Button>(R.id.btn2ece)
        button2nd.setOnClickListener {
            intent = Intent(this, Activity2ndEce::class.java)
            startActivity(intent)
        }
        val button3rd = findViewById<Button>(R.id.btn3ece)
        button3rd.setOnClickListener {
            intent = Intent(this, Activity3rdEce::class.java)
            startActivity(intent)
        }
        val button4th = findViewById<Button>(R.id.btn4ece)
        button4th.setOnClickListener {
            intent = Intent(this, Activity4thEce::class.java)
            startActivity(intent)
        }
        val button5th = findViewById<Button>(R.id.btn5ece)
        button5th.setOnClickListener {
            intent = Intent(this, Activity5thEce::class.java)
            startActivity(intent)
        }
        val button6th = findViewById<Button>(R.id.btn6ece)
        button6th.setOnClickListener {
            intent = Intent(this, Activity5thEce::class.java)
            startActivity(intent)
        }
        val button7th = findViewById<Button>(R.id.btn7ece)
        button7th.setOnClickListener {
            intent = Intent(this, Activity5thEce::class.java)
            startActivity(intent)
        }
        val button8th = findViewById<Button>(R.id.btn8ece)
        button8th.setOnClickListener {
            intent = Intent(this, Activity5thEce::class.java)
            startActivity(intent)
        }
    }
}