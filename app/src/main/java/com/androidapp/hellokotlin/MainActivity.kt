package com.androidapp.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //상수 변수 선언해주는 경우에는 초기화 해줘야함

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)

        var intent : Intent //var 선언한 이유가 화면이 두개여서 값을 어떤 걸 하느냐에 따라 intent값이 달라져야 하기 때문에 var

       // val btnHello = findViewById<Button>(R.id.btnJava)  //선언하면서 초기화, 값에 의해 타입은 자동으로 결정됨, 주의: 번수의 타입 중간에 못바꿈(컴파일 과정에서 결정)

        btnJava.setOnClickListener {
            intent = Intent(this@MainActivity, BmiJavaActivity::class.java)
            startActivity(intent)
        }

        btnKotlin.setOnClickListener {
            intent = Intent(this@MainActivity, BmiKotlinActivity::class.java)
            startActivity(intent)
        }
    }
}