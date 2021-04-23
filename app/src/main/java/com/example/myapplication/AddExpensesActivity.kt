package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager

class AddExpensesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_expenses)

        val exampleList = generateDummyList(500)

//        recycler_view.adapter = ExampleAdapter(exampleList)
//        recycler_view.layoutManager = LinearLayoutManager(this)
//        recycler_view.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): List<ExampleItem>{
        val list = ArrayList<ExampleItem>()

        for (i in 0 until size){
            val drawable = when (i%3){
                0 -> R.drawable.ic_android
                1 -> R.drawable.ic_audio
                else -> R.drawable.ic_sun
            }

            val item = ExampleItem(drawable, "Item $i", "Line 2")
            list += item
        }
        return list
    }
}