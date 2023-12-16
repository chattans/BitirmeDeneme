package com.example.bitirmedeneme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Bu kodlarla sayfalar arasi gecis saglaniyor
        val buttonGirisYap = findViewById<Button>(R.id.girisYapButton)
        val txtButtonKayitOl = findViewById<TextView>(R.id.KayitTxtBtn)

        buttonGirisYap.setOnClickListener(){

            val intent = Intent(this, girisDeneme::class.java)

            startActivity(intent)

        }
        //*******************************************
        try {


        txtButtonKayitOl.setOnClickListener(){
            val  intent = Intent(this, kayit_screen::class.java)

            startActivity(intent)
        }
        }
        catch (e : Exception){
            println(e)
        }
    }
}