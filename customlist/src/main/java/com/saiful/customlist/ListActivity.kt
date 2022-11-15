package com.saiful.customlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
//            val intent = Intent(this, DetailsActivity::class.java)
//            startActivity(intent)
        }
    }
}