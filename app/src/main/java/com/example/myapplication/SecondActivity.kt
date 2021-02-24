package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userName = findViewById<EditText>(R.id.userName)
        val submitBtn = findViewById<Button>(R.id.submitBtn)

        submitBtn.setOnClickListener{
            val userNik = userName.text.toString()

            val intent = Intent(this@SecondActivity, MainActivity::class.java)
            intent.putExtra("User Name", userNik)
            startActivity(intent)
        }

        var intent = intent
        val name = intent.getStringExtra("Name")
        val email = intent.getStringExtra("Email")
        val phone = intent.getStringExtra("Phone")

        val resultTv = findViewById<TextView>(R.id.resultTv)
        resultTv.text = "Name: "+name+"\nEmail: "+email+"\nPhone: "+phone
    }
}