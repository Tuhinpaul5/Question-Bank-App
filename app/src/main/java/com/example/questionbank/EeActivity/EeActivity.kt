package com.example.questionbank.EeActivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.questionbank.R

class EeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ee)

        val button1st = findViewById<Button>(R.id.btn1ee)
        button1st.setOnClickListener {
            intent = Intent(this, Activity1stEe::class.java)
            startActivity(intent)

        }
        val button2nd = findViewById<Button>(R.id.btn2ee)
        button2nd.setOnClickListener {
            intent = Intent(this, Activity2ndEe::class.java)
            startActivity(intent)
        }
        val button3rd = findViewById<Button>(R.id.btn3ee)
        button3rd.setOnClickListener {
            intent = Intent(this, Activity3rdEe::class.java)
            startActivity(intent)
        }
        val button4th = findViewById<Button>(R.id.btn4ee)
        button4th.setOnClickListener {
            intent = Intent(this, Activity4thEe::class.java)
            startActivity(intent)
        }
        val button5th = findViewById<Button>(R.id.btn5ee)
        button5th.setOnClickListener {
            intent = Intent(this, Activity5thEe::class.java)
            startActivity(intent)
        }
        val button6th = findViewById<Button>(R.id.btn6ee)
        button6th.setOnClickListener {
            intent = Intent(this, Activity5thEe::class.java)
            startActivity(intent)
        }
        val button7th = findViewById<Button>(R.id.btn7ee)
        button7th.setOnClickListener {
            intent = Intent(this, Activity5thEe::class.java)
            startActivity(intent)
        }
        val button8th = findViewById<Button>(R.id.btn8ee)
        button8th.setOnClickListener {
            intent = Intent(this, Activity5thEe::class.java)
            startActivity(intent)
        }
    }
}