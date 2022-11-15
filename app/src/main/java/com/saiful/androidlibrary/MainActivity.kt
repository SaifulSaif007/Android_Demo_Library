package com.saiful.androidlibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.saiful.customlist.ListActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            val intent: Intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }
}