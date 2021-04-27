package com.androidapp.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //상수 변수 선언해주는 경우에는 초기화 해줘야함

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHello = findViewById<Button>(R.id.btnHello)  //선언하면서 초기화, 값에 의해 타입은 자동으로 결정됨, 주의: 번수의 타입 중간에 못바꿈(컴파일 과정에서 결정)
        btnHello.setOnClickListener {
            Toast.makeText(this@MainActivity, "Hello Kotlin", Toast.LENGTH_LONG).show()
        }


    }
}