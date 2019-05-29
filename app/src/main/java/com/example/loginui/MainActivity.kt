package com.example.loginui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

/**
 * A Login Form
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to all views
        var username = findViewById(R.id.username) as EditText
        var password = findViewById(R.id.password) as EditText
        var btnReset = findViewById(R.id.btnReset) as Button
        var btnSubmit = findViewById(R.id.btnSubmit) as Button

        btnReset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            username.setText("")
            password.setText("")
        }

        // set on-click listener
        btnSubmit.setOnClickListener {
            val submitusername = username.text
            val submitpassword = password.text
            val intent = Intent(this, Main2Activity::class.java)
            Toast.makeText(this@MainActivity, submitusername, Toast.LENGTH_LONG).show()

            // verify user and pass for admin
            var status = if(submitusername.toString().equals("admin")
                &&submitpassword.toString().equals("password"))

            {
                "Login Matches"

            } else
            {
                "Login Failed"
            }
                Toast.makeText(this@MainActivity, status, Toast.LENGTH_SHORT).show()

            if(submitusername.toString().equals("admin") //go to new page
                &&submitpassword.toString().equals("password"))
            {
                startActivity(intent)
            }





        }
    }
}
