package com.example.inputoutputacti

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Switch


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val zuluSwitch = findViewById<Switch>(R.id.zuluSwitch)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val edtNameInput = findViewById<EditText>(R.id.edtNameInput)
        val txtHello = findViewById<TextView>(R.id.txtHello)



        //toast to ensure the button works
        btnClickMe?.setOnClickListener {
            var greeting: String
            if (zuluSwitch.isChecked) {
                greeting = "Sawubona, ${edtNameInput.text}"
            } else {
                if (edtNameInput.text.toString() == "Sam") {
                    greeting = "Yo, ${edtNameInput.text}"
                } else {
                    greeting = "Greetings, ${edtNameInput.text}"
                }
            }
            //Toast.makeText(this@MainActivity,"Button Clicked",Toast.LENGTH_LONG).show()
            txtHello.text = greeting //welcome text = "welcome + edtNameInput"
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}