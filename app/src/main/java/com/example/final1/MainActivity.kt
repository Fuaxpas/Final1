package com.example.final1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

var BMI = "BMI"
var gender ="gender"
var tde = "tde"

class MainActivity : AppCompatActivity() {
    var bmr = 0.0
    var caltde = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cal: Double
        radioGroup.setOnCheckedChangeListener { group, i ->
            if (radioButton.isChecked) {
                bmr = ((66 + (13.7 * weight2.text.toString().toDouble()) + (5 * hight2.text.toString().toDouble()) - (6.8 * age.text.toString().toDouble())))
            } else if (radioButton2.isChecked){
                bmr = ((665 + (9.6 * weight2.text.toString().toDouble()) + (1.8 * hight2.text.toString().toDouble()) - (4.7 * age.text.toString().toDouble())))
            }
        }
        radioGroup2.setOnCheckedChangeListener { group, i ->
            if (radioButton10.isChecked) {
                caltde = (bmr*1.2)
            } else if (radioButton11.isChecked){
                caltde = (bmr*1.375)
            }else if (radioButton12.isChecked){
                caltde = (bmr*1.55)
            }else if (radioButton13.isChecked){
                caltde = (bmr*1.725)
            }else if (radioButton11.isChecked){
                caltde = (bmr*1.9)
            }

        }
        btncal.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            cal = ((weight.text.toString().toDouble()/(hight.text.toString().toDouble())*2))

            intent.putExtra(BMI,cal)
            intent.putExtra(gender,bmr)
            intent.putExtra(tde,caltde)
            println(bmr)
            println(caltde)
            startActivity(intent)
        }
    }
}