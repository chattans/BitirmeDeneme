package com.example.bitirmedeneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class kayit_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kayit_screen)

        val buttonKayit = findViewById<Button>(R.id.buttonKayit)

        buttonKayit.setOnClickListener(){
            val intent = Intent(this, AnaEkran::class.java)
            startActivity(intent)
        }

    }
}