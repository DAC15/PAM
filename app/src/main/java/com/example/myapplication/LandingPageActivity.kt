package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LandingPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)


        val addExpensesBtn = findViewById<Button>(R.id.addExpensesBtn)


        addExpensesBtn.setOnClickListener{
            val intent = Intent(this, AddExpensesActivity::class.java)

            startActivity(intent)
        }
    }



}