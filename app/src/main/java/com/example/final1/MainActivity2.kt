package com.example.final1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView5.text = intent.getDoubleExtra(BMI,0.0).toString()
        textView7.text = intent.getDoubleExtra(gender,0.0).toString()
        textView9.text = intent.getDoubleExtra(tde,0.0).toString()

        Back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}