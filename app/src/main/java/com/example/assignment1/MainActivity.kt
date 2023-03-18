package com.example.assignment1

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.example.assignment1.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val button: Button = findViewById(id.scoreButton)
        val resultTV: TextView = findViewById(id.scoreTxt)

        var answer1 : String = "Mercury"
        val spinnerVal : Spinner = findViewById(id.spinner1)
        var options1 = arrayOf("Mercury","Venus", "Jupiter")
        spinnerVal.adapter = ArrayAdapter(this, R.layout.simple_list_item_1,options1 )
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                answer1 = options1.get(p2)

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        var answer2 : String = "5"
        val spinnerVal2 : Spinner = findViewById(id.spinner2)
        var options2 = arrayOf("5","6")
        spinnerVal2.adapter = ArrayAdapter(this, R.layout.simple_list_item_1,options2 )
        spinnerVal2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                answer2 = options2.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        var answer3 : String = "Pacific"
        val spinnerVal3 : Spinner = findViewById(id.spinner3)
        var options3 = arrayOf("Atlantic","Pacific", "Arctic")
        spinnerVal3.adapter = ArrayAdapter(this, R.layout.simple_list_item_1,options3 )
        spinnerVal3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                answer3 = options3.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        var answer4 : String = "3"
        val spinnerVal4 : Spinner = findViewById(id.spinner4)
        var options4 = arrayOf("8","5","3")
        spinnerVal4.adapter = ArrayAdapter(this, R.layout.simple_list_item_1,options4 )
        spinnerVal4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                answer4 = options4.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        var answer5 : String = "Femur"
        val spinnerVal5 : Spinner = findViewById(id.spinner5)
        var options5 = arrayOf("Humerus","Femur","Sternum")
        spinnerVal5.adapter = ArrayAdapter(this, R.layout.simple_list_item_1,options5 )
        spinnerVal5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                answer5 = options5.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        var score: Int = 0
        button.setOnClickListener{ view ->
            if(answer1 == "Mercury")
                score++
            if(answer2 == "5")
                score++
            if(answer3 == "Pacific")
                score++
            if(answer4 == "3")
                score++
            if(answer5 == "Femur")
                score++
            resultTV.text = score.toString()
        }
    }

}