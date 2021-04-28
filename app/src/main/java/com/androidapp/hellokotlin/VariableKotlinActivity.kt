package com.androidapp.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    var clickCount = 0
    val startTime= System.currentTimeMillis()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val txtElapsedTime = findViewById<TextView>(R.id.txtElapsedTime)


        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREAN).format(startTime)
        txtActivityStartTime.text="Activity start time: ${timeText}"

        btnClickMe.setOnClickListener {
            clickCount++
            txtCountBtnClicks.text = "Button Clicks: ${clickCount}" // txtCountBtnClicks.text = "Button Clicks: " + clickCount

            var elapsedSeconds = ((System.currentTimeMillis()-startTime) / 1000.0).toLong()
            txtElapsedTime.text="${elapsedSeconds} seconds elapsed"
        }

    }
}