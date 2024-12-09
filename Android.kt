package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content view to the layout defined in activity_main.xml
        setContentView(R.layout.activity_main)

        // Find the TextView in the layout and set its text
        val textView: TextView = findViewById(R.id.textView)
        textView.text = "Hello, World!"
    }
}
