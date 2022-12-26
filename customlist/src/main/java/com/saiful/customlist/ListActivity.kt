package com.saiful.customlist

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.saiful.customdetails.DetailsActivity

class ListActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val textview = findViewById<TextView>(R.id.list_text)
        textview.text = BuildConfig.FLAVOR + BuildConfig.BUILD_TYPE

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            startActivity(intent)
        }
    }
}