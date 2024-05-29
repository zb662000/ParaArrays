package com.example.paraarrays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    // Define parallel arrays for student names and grades
    // Define parallel arrays for student names and grades
    private val studentNames = arrayOf("Alice", "Bob", "Charlie", "David")
    private val studentGrades = intArrayOf(85, 90, 78, 95)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

// Create an ArrayAdapter to populate the ListView with student names and grades
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, generateData())

        listView.adapter = adapter
    }

    // Function to generate data for the ArrayAdapter by combining names and grades
    private fun generateData(): ArrayList<String> {
        val data = ArrayList<String>()
        for (i in studentNames.indices) {
            val studentInfo = "${studentNames[i]} - ${studentGrades[i]}"
            data.add(studentInfo)
        }
        return data
    }
}


