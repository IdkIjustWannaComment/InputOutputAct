package com.example.inputoutputacti

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.btnClickMe)
        //toast to ensure the button works
        btnClickMe?.setOnClickListener {
            Toast.makeText(this@MainActivity,"Button Clicked",Toast.LENGTH_LONG).Show()
        }
            Welcome.txt.Text = "Welcome ${nameTxtField.text}"
            //welcome text = "welcome + nameTxtField


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}