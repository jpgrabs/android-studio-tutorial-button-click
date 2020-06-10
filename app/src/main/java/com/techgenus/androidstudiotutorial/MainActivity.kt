package com.techgenus.androidstudiotutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Welcome Back To My YouTube Channel again for another Tutorial Series
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, Page2::class.java)
            startActivity(intent)
        }

    }
}
